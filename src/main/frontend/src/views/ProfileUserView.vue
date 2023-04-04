<script setup>
import InfoUser from '../components/InfoUser.vue';
import CardProfile from '../components/CardProfile.vue';
import AddNewPostPopUp from '../components/AddNewPostPopUp.vue';

import Header from '../components/Header.vue';
</script>

<template>

<Header/>
<InfoUser class="info"/>
<AddNewPostPopUp/>

<div class="title">
    <div class="text">
        <h2>Mis publicaciones</h2>
    </div>

    <img class="star" src="https://uploads-ssl.webflow.com/62e2b7b9c42bdda27c83d493/6329c1bcb276576e8a46f894_shape-2.svg" alt="">
</div>
<AddPublication/>
<CardProfile/>
</template>

<style lang="scss" scoped>
@use "@/scss/colors" as c;
@use "@/scss/fonts";

// .info{
//     display: flex;
//     justify-content: center;
//     align-self: center;
// }



.title {
    width: 50vw;
    display: flex;
    align-items: center;
    // margin-left: 3vw;
    margin: 2%;
    
    .text{
        font-size: 4vw;
        color: map-get(c.$colors,"black");
        font-family: 'Open Sans', sans-serif ;
        font-weight: bold;
        z-index: 1;
    }

    .star {
        position: relative;
        width: 7vw;
        right: 9%;
    }
}

</style>