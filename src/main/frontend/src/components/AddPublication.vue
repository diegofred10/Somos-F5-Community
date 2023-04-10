<script setup>
import { ref, reactive, onBeforeMount } from "vue";

import PostService from "@/services/PostService.js"
const postService = new PostService()
const titleModel = ref()
const descriptionModel = ref()
const post = reactive({
  title: titleModel,
  description: descriptionModel
})
const submitData = ()=>{
  postService.submitPost(post)
}
</script>

<template>
  <div class="formBody">
    <form>
      <h1 class="addYourPubli">¡Añade una nueva publicación!</h1>
      <input v-model="titleModel" class="title" type="text" placeholder="Titulo de tu publicación" />
      <textarea v-model="descriptionModel" class="description" placeholder="Cuentanos algo interesante..." rows="5" cols="46"></textarea>
      <input type="file" @change="onFileChange" ref="fileInput">
      <div class="buttonsContainer">
        <button class="cancelButton">Cancelar</button>
        <button @click="submitData" class="sendButton">Publicar</button>
      </div>
      <img class="purpleTriangle" src="../assets/images/imagesSomosF5/trianguloAzul 1.png" alt="triangulo morado">
      <img class="roseTriangle" src="../assets/images/imagesSomosF5/trianguloSalmon 2.png" alt="triangulo salmon">
      <img class="greenSplash" src="../assets/images/imagesSomosF5/manchaAzul 1.png" alt="splash verde">

    </form>
  </div>
</template>

<style lang="scss" scoped>
@use "@/scss/colors" as c;

form {
  width: 50em;
  padding: 1em;
  height: 35em;
  background: map-get(c.$colors, "orange");
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: space-around;

  input {
    width: 55%;
    border: 2px solid grey;
    background: white;
    padding: .3em;
  }

  .addYourPubli {
    color: white;
    font-size: xx-large;
    font-weight: bold;
  }
  .title{
    height:2.5em;
  }

  .description {
    background-color: white;
    padding: .5em;
    border: 2px solid grey;
  }
  .resources{
    height:2.5em;
  }

  .buttonsContainer {
    display: flex;
    align-items: space-between;
    z-index: 2;


    .cancelButton {
      background-color: map-get(c.$colors, "light-purple");
      border-radius: 2%;
      color: map-get(c.$colors, "light-grayish");
      margin: 0 5em 0 0;


    }

    .sendButton {
      background-color: map-get(c.$colors, "purple");
      border-radius: 2%;
      color: map-get(c.$colors, "light-grayish");
      margin: 0 0 0 5em;
    }
  }

  .purpleTriangle {
    position: absolute;
    bottom: 0;
    right: 1em;
    width: 9em;
  }

  .roseTriangle {
    position: absolute;
    bottom: 0;
    width: 30em;
    height: 6.5em;
    z-index: 1;

  }

  .greenSplash {
    position: absolute;
    bottom: 0;
    left: 0;
    width: 9em;

  }

}
</style>
