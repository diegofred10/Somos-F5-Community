<script setup>
import { RouterLink, RouterView } from 'vue-router'
import ProfileUser from './views/ProfileUserView.vue';
import AddNewPostPopUp from './components/AddNewPostPopUp.vue';
</script>

<template>

  <AddNewPostPopUp/>
  <RouterView />
 <ProfileUser/>
</template>

<style scoped lang="scss">
</style>
