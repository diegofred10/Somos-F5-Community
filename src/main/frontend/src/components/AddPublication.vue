<script setup>
import { ref, reactive, onBeforeMount } from "vue";

import PostService from "@/services/PostService.js"
const postService = new PostService()
const titleModel = ref()
const descriptionModel = ref()
const post = reactive({
  title: titleModel,
  description: descriptionModel,
})
const submitData = () => {
  postService.submitPost(post)
}
</script>

<template>
  <div class="formBody">
    <form>
      <h1 class="addYourPubli">¡Añade una nueva publicación!</h1>
      <input v-model="titleModel" class="title" type="text" placeholder="Titulo de tu publicación" />
      <textarea v-model="descriptionModel" class="description" placeholder="Cuentanos algo interesante..." rows="5"
        cols="46">
      </textarea>
      <input class="resources" type="file" @change="onFileChange" ref="fileInput">
      <div class="buttonsContainer">
        <button class="cancelButton">Cancelar</button>
        <button @click="submitData" class="sendButton">Publicar</button>
      </div>
      <img class="purpleTriangle" src="../assets/images/imagesSomosF5/trianguloAzul 1.png" alt="triangulo morado">
      <img class="greenSplash" src="../assets/images/imagesSomosF5/manchaAzul 1.png" alt="splash verde">

    </form>
  </div>
</template>

<style lang="scss" scoped>
@use "@/scss/colors" as c;

.formBody {
  background: map-get(c.$colors, "orange");

  @media(min-width: 1023px) and (max-width: 1438px) {
    width: 1000px;
  }

  @media(min-width: 1439px) {
    width: 1000px;
  }

  form {
    display: flex;
    flex-direction: column;
    align-items: center;
    justify-content: space-around;
    width: 100%;
    padding: 1em;
    height: 35em;

    .title {
      background: white;
      font-weight: bold;
      border-radius: 5px;
      z-index: 5;

      @media(min-width: 426px) {
        width: 55%;
      }
    }

    .description {
      background: white;
      font-weight: bold;
      border-radius: 5px;
      z-index: 5;

      @media(min-width: 426px) {
        width: 55%;
      }
    }

    .resources {
      background: white;
      font-weight: bold;
      border-radius: 5px;
      z-index: 5;

      @media(min-width: 426px) {
        width: 55%;
      }
    }

    .addYourPubli {
      color: white;
      font-size: xx-large;
      font-weight: bold;
    }

    .description {
      height: 10em;
    }

    .buttonsContainer {
      display: flex;
      align-items: space-between;
      z-index: 5;

      .cancelButton {
        background-color: map-get(c.$colors, "light-purple");
        border-radius: 2%;
        color: map-get(c.$colors, "light-grayish");
        margin-right: 5vw;
      }

      .sendButton {
        background-color: map-get(c.$colors, "purple");
        border-radius: 2%;
        color: map-get(c.$colors, "light-grayish");
        margin-left: 5vw;
      }
    }

    .purpleTriangle {
      position: absolute;
      bottom: 0;
      right: 1em;
      width: 9em;
    }

    .greenSplash {
      position: absolute;
      bottom: 0;
      left: 0;
      width: 9em;
    }

    @media(max-width: 650px) {
      .purpleTriangle {
        position: absolute;
        bottom: 0;
        right: 0em;
        width: 0em;
      }

      .greenSplash {
        position: absolute;
        bottom: 0;
        left: 0;
        width: 0em;
      }
    }
  }
}

@media(max-width: 426px) {
  form {
    display: flex;
    flex-direction: column;
    justify-content: space-around;
    width: 100%;
    padding: 1em;
    height: 35em;
    background: map-get(c.$colors, "orange");

    .title {
      width: 100%;
      border: 2px solid grey;
      background: white;
      font-weight: bold;
    }

    .description {
      width: 100%;
      border: 2px solid grey;
      background: white;
      font-weight: bold;
    }

    .resources {
      width: 100%;
      border: 2px solid grey;
      background: white;
      font-weight: bold;
    }

    .addYourPubli {
      color: white;
      font-size: 4vh;
      font-weight: bold;
    }

    .description {
      height: 10em;
    }

    .buttonsContainer {
      width: 90vw;
      display: flex;
      justify-content: space-between;
      z-index: 2;

      .cancelButton {
        background-color: map-get(c.$colors, "light-purple");
        border-radius: 5px;
        color: map-get(c.$colors, "light-grayish");
      }

      .sendButton {
        background-color: map-get(c.$colors, "purple");
        border-radius: 5px;
        color: map-get(c.$colors, "light-grayish");
      }
    }
  }
}
</style>
