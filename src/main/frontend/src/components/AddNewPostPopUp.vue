<script setup>

</script>

<template>

    <div>
        <h1>¡Añade una nueva publicación!</h1>
        <form id="formAddNewPost">  
            <input type="text" id="postTitle" placeholder="¡Añade un título a tu publicación!"><br>
            <v-container fluid>
                <v-textarea
                    clearable
                    placeholder="Descripción..."
                ></v-textarea>
  </v-container>
            <v-file-input label="Subir archivo..."></v-file-input>
            <v-btn>Button</v-btn><br>
            <div id="buttonsForm">
                <v-button type="button" id="buttonCancel">Cancelar</v-button>
                <v-button type="btn2" id="buttonPost">Publicar</v-button>
            </div>
        </form>
    </div>

</template>

<style scoped>
div{
    background-color: #FF4700;
    width: 60%;
    margin-left: 20%;
    margin-top: 5%;
}

h1{
    color: white;
    font-size: xx-large;
    display: flex;
    justify-content: center;
}

#postTitle{
    background-color: white;
    width: 60%;
    margin-top: 50px;
    margin-left: 165px;
    display: flex;
    flex-direction: column;
    justify-content: center;
    border: 1px;
    border-color: grey;
}
#description{
    background-color: white;
    height: 100px;
    width: 60%;
    border: 10px;
    margin-left: 165px;
    border-color: grey;
    text-align:start;

    }
#inputFile{
    background-color: white;
    width: 60%;
    margin-left: 165px;

}

#buttonsForm{
    display: flex;
    flex-direction: row;
    justify-content: space-between;
    
}



</style>