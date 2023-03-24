<script setup>
import HeaderLogIn from '../components/HeaderLogIn.vue'
import LogInComp from '../components/LogInComp.vue'

</script>

<template>
    <main id="main">
        <HeaderLogIn />
        <LogInComp />
    </main>
</template>

<style scoped lang="scss">
#main {
    background-color: #FF4700;
    width: 100vw;
    height: 120vh;
}
</style>