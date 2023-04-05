<script setup>
import { ref } from 'vue';
const dialog = ref(false)
</script>

<template>
<div class="addPubli">
<h1 class="addPubliTitle">Añadir publicación</h1> 
<v-btn class="icon" @click="dialog = true">+</v-btn>
</div>
<div class="formulary">
    <v-dialog
            v-model="dialog">
            <v-card class="form">
        <h1>¡Añade una nueva publicación!</h1>
        <form class="formAddNewPost">  
            <input type="text" class="postTitle" placeholder="¡Añade un título a tu publicación!"><br>
            <v-container fluid>
                <v-textarea class="description"
                    clearable
                    placeholder="Descripción..."
                ></v-textarea>
  </v-container>
            <v-file-input class= "inputFile" label="Subir archivo..."></v-file-input>
            <div class="buttonsForm">
                <v-card-actions>
          <v-spacer></v-spacer>
          <v-btn
            class="btnCancel"
            variant="text"
            @click="dialog = false"
          >
            Cancelar
          </v-btn>
          </v-card-actions>
          <v-btn
            class="btnPost"
            variant="text"
            @click="dialog = false"
          >
            Publicar
          </v-btn>
            </div>
        </form>
    </v-card>
    </v-dialog>

</div>
</template>

<style lang="scss" scoped>
@use "@/scss/colors" as c;

.addPubli{
 width: 50%;
 height: 3em;
 display: flex;
 justify-content: space-between;
 align-items: center;
 background-color: map-get(c.$colors,"white");
 border: 3px solid map-get(c.$colors,"grey");

    .addPubliTitle{
        font-size: 1.5em;
        color: map-get(c.$colors,"grey");
        font-family: 'Open Sans', sans-serif ;
        margin-left: 1vw;
    }
    .icon{
        width: 5%;
        height: 100%;
        font-size: 2em;
        color: map-get(c.$colors,"black");
        font-family: 'Open Sans', sans-serif ;
        font-weight: bold;
        
    }
}
</style>