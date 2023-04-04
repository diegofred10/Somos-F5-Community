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
    <AddPublication/>   
    <Search/>
</div>
<div class="publi">
    <PostComp/>
</div>
</template>

<style lang="scss" scoped>
@use "@/scss/colors" as c;
    .tools{

        margin-top: 2vw;
        display: flex;
        flex-direction: column;
        align-items: center;
        width: 94vw;
    }


</style>