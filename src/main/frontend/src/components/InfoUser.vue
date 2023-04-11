<script setup>

import { ref, reactive, computed, onBeforeMount, onBeforeUpdate} from "vue";
import axios from "axios";
import { useAuthStore } from "../stores/authStore";

const store = useAuthStore();
	const url = ref("");
    const user = ref("");
    const profile = ref("");
    const nameModel = ref("");
	const imageUrl = computed(() => url.value);
    let userId = ref('');
    let readOnly=ref(true);

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
                    console.log(url)
				})
				.catch(e => {
					console.log(e);
                    console.log("Catch error upload");
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
                userId = parseInt(user.value.id);

                console.log(userId);
            })
            .catch(e => {
                console.log(e);
                console.log("Catch error username");
            });
    });
    onBeforeMount(() => {
        axios({
            method: "GET",
            url: 'http://localhost:8080/api/profiles/'+ 1,
            withCredentials: true
        })
            .then(response => {
                profile.value = response.data;
            })
            .catch(e => {
                console.log(e);
                console.log("Catch error profile");
            });
    });

    const submit = async ()=> {
        try {
            const profile = {
                name: nameModel.value
            }
            await axios({
                method: "PUT",
                url: 'http://localhost:8080/api/profiles/update/' + 1,
                data: profile,
                withCredentials: true
            })
        } catch (error) {
            console.log("submit error" + error);
        }
    }
</script>

<template>

    <div class="infoUser">
        <div class="photoAndContact">
                <input type="file" @change="onFileChange" ref="fileInput" style="display:none">  
                <!-- <button @click="$refs.fileInput.click()">      -->
                <img @click="$refs.fileInput.click()" class="photoUser" v-if="user.image!=null" :src="'http://localhost:8080/media/' + user.image" alt="img">
                <img @click="$refs.fileInput.click()" class="photoUser" v-else src="../assets/images/perfilVacio.png" alt="img">
                <!-- </button> -->
                <!-- {{ userId }} -->
            <div class="contacts">
                <div class="contact">
                    <i v-if="readOnly==true" @click="readOnly=false" class="fa-solid fa-pen" style="color: white;">
                    </i>
                    <i v-if="readOnly==false" @click="submit" class="fa-solid fa-pen" style="color: black;">
                    </i>
                    <input v-model="nameModel" v-if="profile.name==null" placeholder="Nombre" class="name" :readonly=readOnly> 
                    <input v-model="nameModel" v-else :placeholder=profile.name  class="name" :readonly=readOnly>
                    
                </div>
                <div class="contact">
                    <img class="logo" src="../assets/images/imagesSomosF5/github.png" alt="gitHub">
                    <input v-if="profile.github==null" placeholder="GitHub" class="contactsName" :readonly=readOnly> 
                    <input v-else :placeholder=profile.github  class="contactsName" :readonly=readOnly>
                </div>
                <div class="contact">
                    <img class="logo" src="../assets/images/imagesSomosF5/linkedin.png" alt="linkedin">
                    <input v-if="profile.linkedin==null" placeholder="LinkedIn" class="contactsName" :readonly=readOnly> 
                    <input v-else :placeholder=profile.linkedin class="contactsName" :readonly=readOnly>
                </div>
                <div class="contact">
                    <img class="logo" src="../assets/images/imagesSomosF5/Vector.png" alt="email">
                    <input v-if="profile.email==null" placeholder="Email" class="contactsName" :readonly=readOnly> 
                    <input v-else :placeholder=profile.email class="contactsName" :readonly=readOnly>
                </div>
                <div class="contact">
                    <img class="logo" src="../assets/images/imagesSomosF5/geo-alt.png" alt="geo">
                    <input v-if="profile.location==null" placeholder="Ubicación" class="contactsName" :readonly=readOnly> 
                    <input v-else :placeholder=profile.location class="contactsName" :readonly=readOnly>
                </div>
            </div>   
        </div>

        <div class="design">       
            <img class="arrow" src="https://uploads-ssl.webflow.com/62e2b7b9c42bdda27c83d493/632a9e30dd20f538a3049cc4_shape-13.svg" alt="Imagen de una flecha.">
            <img class="triangle" src="https://uploads-ssl.webflow.com/62e2b7b9c42bdda27c83d493/6329c1bbaf7322b42359abe7_shape-5.svg" alt="Imagen de un triángulo color morado.">       
            <img class="semicircle" src="https://uploads-ssl.webflow.com/62e2b7b9c42bdda27c83d493/63c7aad88f903d7f30ff4eff_emp-shape-05.svg" alt="Imagen de un semicírculo de color negro.">
        </div>
    </div>

</template>

<style lang="scss" scoped>
@use "@/scss/colors" as c;
@use "@/scss/fonts";


.infoUser{
        width: 100%;
        background-color: map-get(c.$colors,"orange");
        display: flex;
        align-items: center;
        justify-content: space-between;

.photoAndContact{
    display: flex;
    width: 35%;
    align-items: center;

    .photoUser{
        border-radius: 100%;
        width: 40%;
        margin: 2%;
        cursor: pointer;
    }
    .contacts{
        width: 50%;
        display: flex;
        flex-direction: column;
        .name{
            width: 100%;
            font-size: 2em;
            color: map-get(c.$colors,"white");
            font-family: 'openSans';
            font-weight: bold;
            margin-left: 1%;
        }
        .contact{
            display: flex;
            flex-direction: row;
            align-items: center;
            font-family: 'openSans' ;
            margin-bottom: 0.5em;

            .logo{
                width: 10%;
                margin-right: 1%;
            }
            .contactsName{
                font-size: 1em;
                margin-left: 2%;
            }
            input{
                color: white;
                border: 0;
                outline: none;
            }
        }
    }
}
    .design{
        display: flex;
        flex-direction: row;
        height: fit-content;
        width: max-content;
        .arrow{
            width: 20%;          
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
            width: 30%;
        }
    }
}
</style>