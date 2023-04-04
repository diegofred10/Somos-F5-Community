<script setup>

</script>

<template>
<div class="add">
<h1 class="title">Añadir publicación</h1> 
<p class="icon">+</p>
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
</style>