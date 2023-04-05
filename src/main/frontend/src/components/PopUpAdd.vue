<script setup>
import { ref } from 'vue';
const dialog = ref(false)
</script>

<template>
<div class="Formulary">
<v-btn color="primary" @click="dialog = true">Abrir</v-btn>
   <v-dialog
            v-model="dialog"
            width="500">
            <v-card class="Formulary">
        <h1>¡Añade una nueva publicación!</h1>
        <form class="formAddNewPost">  
            <input type="text" class="postTitle" placeholder="¡Añade un título a tu publicación!"><br>
            <v-container fluid>
                <v-textarea
                    clearable
                    placeholder="Descripción..."
                ></v-textarea>
  </v-container>
            <v-file-input label="Subir archivo..."></v-file-input>
            <div class="buttonsForm">
                <v-btn type="button" class="buttonCancel">Cancelar</v-btn>
                <v-btn type="btn2" class="buttonPost">Publicar</v-btn>
            </div>
        </form>
    </v-card>
    </v-dialog>
</div>
</template>

<style scoped>

.Formulary{
    background-color:#FF4700;

}

.formAddNewPost{
    width: 100%;
    height: 100%;


}

h1{
    color: white;
    font-size: xx-large;
    display: flex;
    justify-content: center;
    margin-top: 50px;
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
.buttonCancel{
    background-color: #4311B9;
}
    
.buttonPost{
    background-color: #4311B9;
}



</style>