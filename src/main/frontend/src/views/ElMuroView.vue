<script setup>
import Header from '../components/Header.vue';
import UserFeed from '../components/UserFeed.vue';
import AddPublication from '../components/AddPublication.vue';
import Search from '../components/Search.vue'
import PostComp from '../components/PostComponent.vue'

</script>

<template>
    <Header/>
<UserFeed/>
<div class="tools">
    <!-- <AddPublication/>    -->
    <Search/>
</div>
<div class="publi">
    <PostComp/>
</div>
</template>

<style lang="scss" scoped>
@use "@/scss/colors" as c;

main {
    margin: 0 auto;
    width: 80%;
    display: flex;
    justify-content: center;
    align-items: center;
    flex-direction: column;
}

.tools {
    display: flex;
    justify-content: center;
    align-items: center;
    width: 90vw;

    .modal-container {
        align-self: start;

        .modal {
            background: map-get(c.$colors, "white");

            display: flex;
            border: 2px solid black;
            width: 100%;
            // padding: 2em;
            font-size: 1.2em;
            color: black;
            height: 2em;

            .btn-add {
                margin-left: 1em;
            }
        }
    }
}
</style>