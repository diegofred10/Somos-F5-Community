<script setup>

</script>
<template>
  <div class="header">

    <a href="/" aria-current="page" class="headerLogo"></a>

    <div class="menuContainer">

      <nav role="navigation" class="menuNav">
        <router-link to="/mispublicaciones" class="nav__link" href=""
          >Mis Publicaciones</router-link >
        <router-link to="/elmuro" class="nav__link" href=""
          >El Muro</router-link>
        <router-link to="/" href="">LogOut</router-link>
      </nav>

     

    </div>

  </div>
 
  <div class="addPost">
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
<style lang="scss" scoped>
@use "@/scss/colors" as c;
@use "@/scss/mixins" as m;

.header {
  position: fixed;
  left: 0%;
  top: 0%;
  right: 0%;
  bottom: 0%;
  display: flex;
  height: 5rem;
  -webkit-box-pack: center;
  justify-content: center;
  background-color: map-get(c.$colors, "light-orange");

  .headerLogo {
    background-image: url("https://uploads-ssl.webflow.com/62e2b7b9c42bdda27c83d493/6329c1bc9e1976ae0ada64b0_somos-f5.svg");
    background-size: contain;
    background-position: 0% 50%;
    background-repeat: no-repeat;
    width: 7rem;
    height: 2.5rem;
    margin: auto;
    margin-left: 1vw;
  }
  .menuContainer {
    display: flex;
    -webkit-box-pack: justify;
    justify-content: space-between;
    -webkit-box-align: center;

    .menuNav {
      display: flex;
      -webkit-box-align: center;
      align-items: center;
      grid-column-gap: 2rem;
      font-family: "Open Sans";
      margin-right: 1em;

      .nav__link {
        border-bottom: 4px solid map-get(c.$colors, "orange");
        font-weight: 700;
      }
      // @include m.mv(800px) {
      //   display: none;
      // }
    }
  }
}
.addPost{
    background-color: #FF4700;
    width: 60%;
    margin-left: 20%;
    margin-top: 5%;
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
    }
    
</style>
