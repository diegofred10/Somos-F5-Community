<script setup>
import Header from '../components/Header.vue';
import BannerCoders from '../components/BannerCoders.vue';

</script>
<template>
<main>
<Header/>
<BannerCoders/>
<div class="titleView">
<h1 class="titleText">Todas las publicaciones</h1>
</div>
</main>
</template>
<style lang="scss">
@use "@/scss/colors" as c;
@use "@/scss/fonts";

main{
  margin: 0 auto;
  width: 80%;
  display: flex;
  justify-content: center;
  align-items: center;
  flex-direction: column;

  .titleView{
        width: 70%;
        margin: 3%;
        background-image: url(../assets/images/separatorTurquesa.png);
        background-size: 100%;
        display: flex;
        align-items: end;
        justify-content: center;
    .titleText{
        color: white;
        font-family: 'Open Sans', sans-serif ;
        font-size: xx-large;
        font-weight: bold;
    }
  }
}
</style>