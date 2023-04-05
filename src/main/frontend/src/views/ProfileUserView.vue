<script setup>
import InfoUser from '../components/InfoUser.vue';
import AddPublication from '../components/AddPublication.vue';
import CardProfile from '../components/CardProfile.vue';
import Header from '../components/Header.vue';
</script>

<template>
<Header/>
<InfoUser/>
<div class="title">
    <div class="text">
        <h2>Mis publicaciones</h2>
    </div>
    <img class="star" src="https://uploads-ssl.webflow.com/62e2b7b9c42bdda27c83d493/6329c1bcb276576e8a46f894_shape-2.svg" alt="">
</div>
<AddPublication class="addButton"/>
<CardProfile/>
</template>

<style lang="scss" scoped>
@use "@/scss/colors" as c;
@use "@/scss/fonts";

.title {
    width: 100%;
    display: flex;
    align-items: center;
    margin: 2%;
    
    .text{
        font-size: xx-large;
        color: map-get(c.$colors,"black");
        font-family: 'Open Sans', sans-serif ;
        font-weight: bold;
        z-index: 1;
    }

    .star {
        position: relative;
        width: 5%;
        right: 3%;
    }
}

.addButton{
    left: 10%;
}




</style>