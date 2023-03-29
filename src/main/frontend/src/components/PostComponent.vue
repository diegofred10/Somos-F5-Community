<script setup>
    let random = Math.round(Math.random()*2+1);
    let image = "src/assets/images/separator" + random + ".png";
</script>

<template>
    <div class="post">
        <div class="nameContainer">
            <h1 class="nameUser">Saúl Aguinaga backend God</h1>
            <h3 class="date">24-03-2023</h3>
        </div>
        <div class="postContainer">
            <h2 class="postTitle">Como hacer un buen CRUD en condiciones con Java</h2>
            <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the
                industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and
                scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into
                electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of
                Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like
                Aldus PageMaker including versions of Lorem Ipsum</p>
            </div>
            <div id="separator">
                <img :src="image" alt="separador">
            </div>   
    </div>
</template>

<style scoped lang="scss">
@use "@/scss/colors" as c;
.post {
    
    background-color: map-get(c.$colors, "light-orange");
    width: 70%;

    .nameContainer {
        display: flex;
        justify-content: space-between;

        .nameUser {
            font-size: larger;
            font-weight: bold;
            
        }

        .date {
            font-size: medium;
            color: map-get(c.$colors, "grey");
            align-self: flex-end;
        }
    }

    .postContainer {
        border: solid map-get(c.$colors, "grey-blue");
        background-color: map-get(c.$colors, "white");
        font-weight: 400;

        .postTitle {
            font-size: large;
            font-weight: 600;
        }
    }
    #separator img{
        margin-top: 2%;
        width: 100%;
        height: 3vh;
    }
}
</style>


