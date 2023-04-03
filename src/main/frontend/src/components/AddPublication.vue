<script setup>
import { ref } from 'vue';
  const dialog = ref(false)

</script>

<template>
    <div class="add">
<v-btn class= "title" @click="dialog = true">Añadir publicación</v-btn>
    <p class="icon">+</p>
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


    
.add{
 width: 60vw;
 height: 7vh;
 margin-top: 2vw;
 display: flex;
 justify-content: space-between;
 justify-self: center;
 align-items: center;
 background-color: map-get(c.$colors,"white");
 border: 3px solid map-get(c.$colors,"grey");
    .title{
        font-size: 1.8vw;
        color: map-get(c.$colors,"grey");
        font-family: 'Open Sans', sans-serif ;
        margin-left: 1vw;
    }
    .icon{
        font-size: 3vw;
        color: map-get(c.$colors,"black");
        font-family: 'Open Sans', sans-serif ;
        font-weight: bold;
        margin-right: 2vw;
        margin-bottom: 1%;
    }
}


.formulary{
    background-color:#FF4700;
    width: 100%;
    height: 100%;

.form{
    background-color: map-get(c.$colors, "orange");
    

    
    .formAddNewPost{
        width: 100%;
        height: 100%;
        color: #FF4700;
        
        
    }
    
    h1{
        color: white;
        font-size: xx-large;
        display: flex;
        justify-content: center;
        margin-top: 50px;
        background-color: #FF4700;
}

.postTitle{
    color: white;
    width: 60%;
    margin-top: 50px;
    margin-left: 165px;
    display: flex;
    flex-direction: column;
    justify-content: center;
    border: 1px;
    border-color: black;
}
.description{
    background-color: white;
    height: 100px;
    width: 60%;
    border: 10px;
    margin-left: 165px;
    border-color: grey;
    text-align:start;

    }
.inputFile{
    color: white;
    width: 40%;
    margin-left: 500px;
    
}

.buttonsForm{
    display: flex;
    flex-direction: row;
    justify-content: space-around;
    margin-bottom: 50px;
    
}
.btnCancel{
    background-color: #4311B9;
}

.buttonPost{
    background-color: #4311B9;
}
}

}
</style>