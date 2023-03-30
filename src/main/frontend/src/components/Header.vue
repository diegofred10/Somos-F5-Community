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

      <Slide width="250" right class="slide">
        <a href="#" class="nav-bar__link">Mis Publicaiones</a>
        <a href="#" class="nav-bar__link">El Muro</a>
        <a href="#" class="nav-bar__link">LogOut</a>
      </Slide>

    </div>

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
      @include m.mv(800px) {
        display: none;
      }
    }
  }
}
.slide {
  display: none;
  @include m.mv(800px) {
    display: block;
    position: relative;
    // right: 5%;
    top: 5em;

    .bm-burger-bars {
      background-color: white;
    }
  }
}
</style>
