<script setup>
import { ref, onBeforeMount } from "vue";
import HeaderAdmin from '../components/HeaderAdmin.vue';
import BannerAdmin from '../components/BannerAdmin.vue';
import PostService from "../services/PostService";
import CardProfile from "../components/CardProfile.vue";
import { useProgrammatic } from "@oruga-ui/oruga-next";
import AddPublication from "../components/AddPublication.vue";


import ProfileService from '../services/ProfileService';


const profileService = new ProfileService();
	
	let profiles = ref([]);
 	onBeforeMount(async()=>{
	await postService.fetchAllPost()
	await profileService.fetchAllProfiles();
	posts.value = postService.getPost()
	console.log(posts.value.idProfile);
	console.log(posts.profile_id);
	profiles.value = profileService.getProfile();
	console.log(profiles.value);
	console.log(posts.value)
	});


let input = ref("");

const postService = new PostService();

let posts = ref([]);

onBeforeMount(async () => {
  await postService.fetchAllPost();
  posts.value = postService.getPost();
  console.log(posts.value);
});

function filteredList() {
  return posts.value.filter(
    (post) =>
      post.title.toLowerCase().includes(input.value.toLowerCase()) ||
      post.description.toLowerCase().includes(input.value.toLowerCase())
  );
}

const trapFocus = ref(false);
const { oruga } = useProgrammatic();

function cardModal() {
  oruga.modal.open({
    component: AddPublication,
    trapFocus: true,
  });
}






</script>

<template>
<main>
<HeaderAdmin/>
<BannerAdmin/>
<div class="modal-container">
      <o-button @click="cardModal()" class="modal">
        AÑADIR PUBLICACION
        <i class="fa-solid fa-plus btn-add"></i>
      </o-button>
      
      <div class="searcher">
        <div class="inputSearch">
          <i class="lupa fa-solid fa-magnifying-glass" style="color: #adadad"></i>
          <input
          type="text"
          v-model="input"
          placeholder="  Buscar publicaciones..."
          />
        </div>
        <CardProfile v-for="post in filteredList()" :post="post" />
        
        <div class="itemError" v-if="input && !filteredList().length">
          <p>No results found!</p>
        </div>
      </div>
    </div>
</main>

</template>

<style lang="scss">
@use "@/scss/colors" as c;
@use "@/scss/fonts";

main{
  margin: 0 auto;
  width: 80%;
  display: flex;
  justify-content: center;
  align-items: center;
  flex-direction: column;
}

.modal-container {
  margin-top: 2em;
  align-self: start;
  display: flex;
  flex-direction:row;
  justify-content: space-between;
  gap: 2em;
  width: 100%;

  .modal {
    background: map-get(c.$colors, "white");
    display: flex;
    border: 2px solid black;
    width: 20vw;
    font-size: 1.2em;
    color: black;
    height: 2em;

    .btn-add {
      margin-left: 1em;
    }
  }


  
  .searcher {
    background-color: map-get(c.$colors, "light-purple");
    width: 20vw;
    height: 2.5em;
    border-radius: 3px;
    
    
    .inputSearch {
      display: flex;
      flex-direction: row;
      justify-content: center;
      align-items: center;
      width: 100%;
      font-family: "OpenSans";
      font-size: 1.5vw;
      margin-bottom: 5vh;
      padding-left: 1%;
      
      .lupa {
        font-size: 1em;
      }
      
      input {
        outline: none;
        width: 100%;
      }
      
      }
    
    .itemError {
      font-family: "OpenSans";
      font-size: 2vw;
    }
  }
}

@media (max-width: 599px) {
    .title {
      width: 80%;
      display: flex;
      align-items: center;
      justify-content: center;
      .text {
        font-size: 1.2rem;
      }

      .star {
        width: 12%;
        right: 7%;
      }
    }
    .modal-container {
      margin-top: 2%;
      width: 60%;
      font-size: 50%;
    }
  }


</style>