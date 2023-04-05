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
<div class="infoUser">
    <div class="photoUser">
        <input type="file" @change="onFileChange" ref="fileInput" style="display:none">  
        <button @click="$refs.fileInput.click()">    
        <img class="imgProfile" :src="'http://localhost:8080/media/' + user.image" alt="img">
    </button>
    </div>
    <div class="contacts">
        <input v-if="profile.name==null" placeholder="Nombre" class="name"> 
        <input v-else :placeholder=profile.name  class="name">
        <div class="contact">
            <img class="logo" src="../assets/images/imagesSomosF5/github.png" alt="gitHub">
            <p class="contactsName">{{ profile.github }}</p>
        </div>
        <div class="contact">
            <img class="logo" src="../assets/images/imagesSomosF5/linkedin.png" alt="linkedin">
            <p class="contactsName">{{ profile.linkedin }}</p>
        </div>
        <div class="contact">
            <img class="logo" src="../assets/images/imagesSomosF5/Vector.png" alt="email">
            <p class="contactsName">{{ profile.email }}</p>
        </div>
        <div class="contact">
            <img class="logo" src="../assets/images/imagesSomosF5/geo-alt.png" alt="geo">
            <p class="contactsName">{{ profile.location }}</p>
        </div>   
    </div>
    <div class="design">       
        <img class="arrow" src="https://uploads-ssl.webflow.com/62e2b7b9c42bdda27c83d493/632a9e30dd20f538a3049cc4_shape-13.svg" alt="">
        <img class="triangle" src="https://uploads-ssl.webflow.com/62e2b7b9c42bdda27c83d493/6329c1bbaf7322b42359abe7_shape-5.svg" alt="">       
        <img class="semicircle" src="https://uploads-ssl.webflow.com/62e2b7b9c42bdda27c83d493/63c7aad88f903d7f30ff4eff_emp-shape-05.svg" alt="">
    </div>
</div>
</template>

<style lang="scss" scoped>
@use "@/scss/colors" as c;
@use "@/scss/fonts";

.infoUser{
background-color: map-get(c.$colors,"orange");
height:auto;
width: 96%;
display: flex;
align-items: center;
// justify-content: space-around;
margin: 2%;

    .photoUser{
        width: 15%;
        // margin:2vw;
        // margin-top:2vw;
        // margin-bottom:2vw;
        // margin-left:2vw;
        .imgProfile{
            border-radius: 100%;
        }
    }

    .contacts{
        display: flex;
        // align-items: center;
        // justify-content: center;
        flex-direction: column;
        // align-items: flex-start;
        // margin-right: 6vw;
        
        .name{
            font-size: 2em;
            color: map-get(c.$colors,"white");
            font-family: 'openSans';
            font-weight: bold;
            
        }
        .contact{
            display: flex;
            flex-direction: row;
            align-items: center;
        // margin-top: 2%;
        font-family: 'openSans' ;
        margin-bottom: 0.5em;

            .logo{
                width: 10%;


            }
            .contactsName{
                color: white;
                margin-left: 2%;
            }
        }

    }

    .design{
        display: flex;
        // justify-content: flex-end;
        // display: contents;
        flex-direction: row;
        width: 40%;
  
        
        .arrow{
            width: 45%;          
            z-index: 1;
            // right: 35vw;
            // top: 10%;
            // margin-top: -2%;
            // position: relative;    
            rotate: -20deg;
        }
        .triangle{
            width: 20%;
            margin-bottom: -15%;
            // top: -13%;
           
            // position: relative;
            rotate: 270deg;
        }
        .semicircle{
            // left: 5%;
            z-index: 1;
            rotate: 180deg;
            width: 60%;
            // top: -12%;
            // position: relative;
        }
    }
}



</style>