<script setup>
import InfoUser from '../components/InfoUser.vue';
import AddPublication from '../components/AddPublication.vue';
import CardProfile from '../components/CardProfile.vue';
import Header from '../components/Header.vue';
</script>

<template>
    <main>
        <Header/>
        <InfoUser />
        <div class="title">
            <div class="text">
                <h2>Mis publicaciones</h2>
            </div>
            <img class="star"
                src="https://uploads-ssl.webflow.com/62e2b7b9c42bdda27c83d493/6329c1bcb276576e8a46f894_shape-2.svg" alt="">
        </div>
        <AddPublication class="addButton" />
        <CardProfile />

    </main>
</template>

<style lang="scss" scoped>
@use "@/scss/colors" as c;
@use "@/scss/fonts";



.title {
    width: 46vw;
    display: flex;
    align-items: center;
    justify-content: center;
    margin: 2%;

    .text {
        font-size: xx-large;
        color: map-get(c.$colors, "black");
        font-family: 'Open Sans', sans-serif;
        font-weight: bold;
        z-index: 1;
    }

    .star {
        position: relative;
        width: 5%;
        right: 3%;
    }
}

.addButton {
    left: 10%;
}

main {
    margin: 0 auto;
    width: 80%;
    display: flex;
    justify-content: center;
    align-items: center;
    flex-direction: column;
}
</style>