<script setup>
import HeaderAdmin from '../components/HeaderAdmin.vue';
import BannerAdmin from '../components/BannerAdmin.vue';
import Search from '../components/Search.vue';
</script>

<template>
<main>
<HeaderAdmin/>
<BannerAdmin/>
<Search/>
</main>
</template>

<style lang="scss">
@use "@/scss/colors" as c;
@use "@/scss/fonts";

main{
  margin: 0 auto;
  width: 80%;
  display: flex;
  justify-content: center;
  align-items: center;
  flex-direction: column;
}

</style>