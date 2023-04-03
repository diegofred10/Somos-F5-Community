<script setup>
import Header from '../components/Header.vue';
import UserFeed from '../components/UserFeed.vue';
import AddPublication from '../components/AddPublication.vue';
import Filter from '../components/Filter.vue'
import PostComp from '../components/PostComponent.vue'
</script>

<template>
    <Header/>
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
    display: flex;
    justify-content: center;
    align-items: center;
    width: 90vw;
}


</style>