<script setup>
// const buttonDelete = document.getElementById('delete');

// buttonDelete.addEventListener('click', () => {
//   // código para borrar elementos
// });

</script>

<template>
<div class="buttons">
    <button class="edit"><img src="../assets/images/imagesSomosF5/edit_FILL1_wght400_GRAD0_opsz48.png" alt=""></button>
    <button class="delete"><img src="../assets/images/imagesSomosF5/delete_FILL1_wght400_GRAD0_opsz48.png" alt=""></button>
</div>
</template>

<style scoped lang="scss">
@use "@/scss/colors" as c;

.buttons{

    .edit{
        background-color: map-get(c.$colors,"light-purple");
        margin: 1vw;
        border-radius: 5%;
        cursor: pointer;
        width: 3vw;
    }

    .delete{
        background-color: map-get(c.$colors,"light-purple");
        margin: 1vw;
        border-radius: 5%;
        cursor: pointer;
        width: 3vw;
    }
}
</style>
