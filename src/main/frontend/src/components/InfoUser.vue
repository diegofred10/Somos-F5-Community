<script setup>

import { ref, reactive, computed, onBeforeMount } from "vue";
import axios from "axios";
import { useAuthStore } from "../stores/authStore";

const store = useAuthStore();
	const url = ref("");
    const user = ref("");
    const profile = ref("");
	const imageUrl = computed(() => url.value);

	const onFileChange = event => {
		const file = event.target.files[0];
		if (file) {
			const formData = new FormData();
			formData.append("file", file);
			axios({
				method: "POST",
				url: "http://localhost:8080/media/upload",
				data: formData,
				withCredentials: true

			})
				.then(response => {
					url.value = response.data.url;
                    console.log(url.value)
				})
				.catch(e => {
					console.log(e);
				});
		}
        window.location.reload()
	};
    onBeforeMount(() => {
        axios({
            method: "GET",
            url: "http://localhost:8080/api/users/username/"+ store.username,
            withCredentials: true
        })
            .then(response => {
                user.value = response.data;
                user.value.profile_id = 1;
                console.log(user.value.profile_id)
            })
            .catch(e => {
                console.log(e);
            });
    });
    onBeforeMount(() => {
        axios({
            method: "GET",
            url: 'http://localhost:8080/api/profiles/'+ user.value.profile_id,
            withCredentials: true
        })
            .then(response => {
                profile.value = response.data;
                console.log(profile.value)
            })
            .catch(e => {
                console.log(e);
            });
    });
</script>

<template>
<div class="banner">
    <div class="infoUser">
        <div class="photoAndContact">
            <div class="photoUser">
                <input type="file" @change="onFileChange" ref="fileInput" style="display:none">  
                <button @click="$refs.fileInput.click()">     
                <img class="imgProfile" v-if="user.image!=null" :src="'http://localhost:8080/media/' + user.image" alt="img">
                <img class="imgProfile" v-else src="../assets/images/perfilVacio.png" alt="img">
                </button>
            </div>
            <div class="contacts">
                <div class="contact">
                    
                    <input v-if="profile.name==null" placeholder="Nombre" class="name"> 
                    <input v-else :placeholder=profile.name  class="name">
                    <i @click="" class="fa-solid fa-pen"></i>
                <div class="contact">
                    <img class="logo" src="../assets/images/imagesSomosF5/github.png" alt="gitHub">
                    <input v-if="profile.github==null" placeholder="GitHub" class="contactsName"> 
                    <input v-else :placeholder=profile.github  class="contactsName">
                </div>
                <div class="contact">
                    <img class="logo" src="../assets/images/imagesSomosF5/linkedin.png" alt="linkedin">
                    <input v-if="profile.linkedin==null" placeholder="LinkedIn" class="contactsName"> 
                    <input v-else :placeholder=profile.linkedin class="contactsName">
                </div>
                <div class="contact">
                    <img class="logo" src="../assets/images/imagesSomosF5/Vector.png" alt="email">
                    <input v-if="profile.email==null" placeholder="Email" class="contactsName"> 
                    <input v-else :placeholder=profile.email class="contactsName">
                </div>
                <div class="contact">
                    <img class="logo" src="../assets/images/imagesSomosF5/geo-alt.png" alt="geo">
                    <input v-if="profile.location==null" placeholder="Ubicación" class="contactsName"> 
                    <input v-else :placeholder=profile.location class="contactsName">
                </div>
            </div>   
        </div> 
        </div>
        <div class="design">       
            <img class="arrow" src="https://uploads-ssl.webflow.com/62e2b7b9c42bdda27c83d493/632a9e30dd20f538a3049cc4_shape-13.svg" alt="">
            <img class="triangle" src="https://uploads-ssl.webflow.com/62e2b7b9c42bdda27c83d493/6329c1bbaf7322b42359abe7_shape-5.svg" alt="">       
            <img class="semicircle" src="https://uploads-ssl.webflow.com/62e2b7b9c42bdda27c83d493/63c7aad88f903d7f30ff4eff_emp-shape-05.svg" alt="">
        </div>
    </div>
</div>
</template>

<style lang="scss" scoped>
@use "@/scss/colors" as c;
@use "@/scss/fonts";

.banner{
    display: flex;
    justify-content: center;
    width: 100%;

    .infoUser{
        display: flex;
        width: 90%;
        background-color: map-get(c.$colors,"orange");

    .photoAndContact{
        display: flex;
        align-items: center;
        justify-content: space-between;
        width: 60%;
            .photoUser{
                width: 50%;

                .imgProfile{
                    border-radius: 100%;
                }
            }
            .contacts{
                display: flex;
                flex-direction: column;
                
                .name{
                    font-size: 2em;
                    color: map-get(c.$colors,"white");
                    font-family: 'openSans';
                    font-weight: bold;
                    
                }
                .contact{
                    display: flex;
                    flex-direction: column;
                    font-family: 'openSans' ;
                    margin-bottom: 0.5em;
                    input{
                        width: 50%;
                    }
                    .logo{
                        width: 5%;
                    }
                    .contactsName{
                        color: white;
                        margin-left: 2%;
                    }
                }
            }
        }
    .design{
        display: flex;
        // justify-content: flex-end;
        flex-direction: row;
        width: 35%;
        .arrow{
            width: 30%;          
            z-index: 1;  
            rotate: -20deg;
        }
        .triangle{
            width: 20%;
            margin-bottom: -15%;
            rotate: 270deg;
        }
        .semicircle{
            z-index: 1;
            rotate: 180deg;
            width: 40%;
        }
    }
    }
}

</style>