<script setup>
import UserFeed from '../components/UserFeed.vue';
import AddPublication from '../components/AddPublication.vue';
import Filter from '../components/Filter.vue'
import PostComp from '../components/PostComponent.vue'
</script>

<template>
<UserFeed/>
<div class="tools">
    <AddPublication/>   
    <Filter/>
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