<script setup>

</script>

<template>
<div class="buttons">
    <button class="edit">Editar</button>
    <button class="delete">Borrar</button>
</div>
</template>

<style scoped lang="scss">
@use "@/scss/colors" as c;


.buttons{
    .edit{
        background-color: map-get(c.$colors,"purple");
        color: map-get(c.$colors,"white");
        font-family: 'Open Sans', sans-serif ;
        font-size: 2vw;
        width: 10vw;
        height: 8vh;
        margin: 1vw;
        border-radius: 5%;
        cursor: pointer;
    }

    .delete{
        background-color: map-get(c.$colors,"light-purple");
        color: map-get(c.$colors,"white");
        font-family: 'Open Sans', sans-serif ;
        font-size: 2vw;
        width: 10vw;
        height: 8vh;
        margin: 1vw;
        border-radius: 5%;
        cursor: pointer;
    }
}
</style>
