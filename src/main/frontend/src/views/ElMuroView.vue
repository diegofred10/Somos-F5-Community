<script setup>
import Header from "../components/Header.vue";
import UserFeed from "../components/UserFeed.vue";
import CardProfile from "../components/CardProfile.vue";
import PostService from "../services/PostService";
import { ref, onBeforeMount } from "vue";

const postService = new PostService();

let posts = ref([]);

onBeforeMount(async () => {
  await postService.fetchAllPost();
  posts.value = postService.getPost();
  console.log(posts.value);
});
</script>

<template>
  <main>
    <Header />
    <UserFeed />

    <div class="searcher">
    <input class="text" type="text" v-model="input" placeholder= "  buscar.." />
    <div class="itemPosts" v-for="post in filterList()" :post="post">
      <p>{{ post }}</p>
    </div>

    <div class="itemError" v-if="input && !filter().length">
      <p>No hay resultados</p>
    </div>
  </div>
    <div class="publi">

      <CardProfile v-for="post in posts" :post="post" />

    
    </div>
  </main>
</template>

<style lang="scss" scoped>
@use "@/scss/colors" as c;

main {
  margin: 0 auto;
  width: 80%;
  display: flex;
  justify-content: center;
  align-items: center;
  flex-direction: column;

  .searcher {
  background-color: map-get(c.$colors, "light-purple");
  margin-top: 1vw;
  width: 60vw;
  height: 7vh;
  border-radius: 3px;
  .text {
    width: 60vw;
    font-family: "Open Sans", sans-serif;
    font-size: 2vw;

    ::placeholder
    :root{
      --fa-style-family: "Font Awesome 6 Free";
      --fa-style: 200; 
      --fa-border-color: WhiteSmoke;
    --fa-border-padding: 2em;
    }

  }

  .itemError {
    width: 60vw;
    font-family: "Open Sans", sans-serif;
    font-size: 2vw;
  }
}

    .modal-container {
      align-self: start;

      .modal {
        background: map-get(c.$colors, "white");

        display: flex;
        border: 2px solid black;
        width: 100%;
        // padding: 2em;
        font-size: 1.2em;
        color: black;
        height: 2em;

        .btn-add {
          margin-left: 1em;
        }
      }
    }
  }

</style>
