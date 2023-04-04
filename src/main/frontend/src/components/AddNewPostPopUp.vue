<script setup>
import { ref } from 'vue';
const dialog = ref(false)
</script>

<template>
    <div class="add">
<v-btn class= "title" @click="dialog = true">Añadir publicación</v-btn>
        <p class= "icon">+</p>
    </div>
    <v-dialog
        v-model="dialog">
        <v-card class="form">
        <h1>¡Añade una nueva publicación!</h1>
        <!-- <form class="formAddNewPost">   -->
            <input type="text" class="postTitle" placeholder="¡Añade un título a tu publicación!">
            <v-container fluid>
                <v-textarea class="description"
                    clearable
                    placeholder="Descripción..."
                    width= "600"
                ></v-textarea>
  </v-container>
        <!-- <div class="inputFile" placeholder="Subir archivo..."> -->
            <v-file-input class= "inputFiles" label="Subir archivo..." placeholder="Subir archivo..."></v-file-input>
            <div class="buttonsForm">
                <v-card-actions>
            <v-btn
                    
                 class="btnCancel"
                 variant="text"
                 @click="dialog =false"
                 >
                 Cancelar
                </v-btn>
                </v-card-actions>
                <v-btn 
                class="btnPost"
                variant="text"
                @click="dialog = false">
                Publicar
            </v-btn>
            </div>
        <!-- </form> -->
        </v-card>
        </v-dialog>



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
background-color: map-get(c.$colors, "white");
border: 3px solid map-get(c.$colors, "grey");

.title{
font-size: 1.8vw;
color: map-get(c.$colors, "grey");
font-family: 'Open Sans', sans-serif ;
margin-left: 1vw;

}
.icon{
font-size: 3vw;
color: map-get(c.$colors, "black");
font-family: 'Open Sans', sans-serif ;
font-weight: bold;
margin-right: 2vw;
margin-bottom: 1%;
    }
}

.form{
    width: 50%;
    height: 50%;
    background-color: map-get(c.$colors, "orange");
    color: map-get(c.$colors, "white");
    font-family: 'Open Sans', sans-serif ;
        h1{
            display: flex;
            flex-direction: row;
            justify-content: space-evenly;
            margin-top: 40px;
            margin-left: 30px;
            font-size: x-large;

            
    }

}

.formAddNewPost{
    //  width: 100%;
    //  height:100%;
     color: map-get(c.$colors, "grey");
     font-size: xx-large;
     display: flex;
     flex-direction: column;
     margin-top: 50px;
     background-color: map-get(c.$colors, "orange");
    

 }

.postTitle{
    background-color: map-get(c.$colors, "white");
    width: 60%;
    margin-top: 50px;
    margin-left: 145px;
    border: 1px;
    border-style: solid;
    border-color: white;

}

#v-input-details{
    color: white;
    background-color: orangered;
    
}


  .description{
      background-color: map-get(c.$colors, "white");
      height: 200px;
      width: 390px;
      margin-left: 130px;

        color:black;
     display: flex;
     flex-direction: column;
     justify-content: space-around;
     text-align: start;




    }
.inputFiles{
    background-color: map-get(c.$colors, "white");
    width: 60%;
    height: 50%;
    margin-left: 145px;


}

.buttonsForm{
    display: flex;
    flex-direction: row;
    justify-content: center;
    margin-top: 30px;
    margin-bottom: 20px;

    
}

.btnCancel{
    background-color: map-get(c.$colors, "grey");
    color: map-get(c.$colors, "white");
    display: flex;
    flex-direction: row;
    margin-top: 1px;
    min-width: 100px;
    margin-left: 10px;


}

.btnPost{
    background-color: map-get(c.$colors, "purple");
    color: map-get(c.$colors, "white");
    margin-left: 100px;
    margin-top: 10px;
    display: flex;
    flex-direction: row;
    justify-content: center;
    max-width: 100px;


}

</style>