<script setup>

</script>

<template>
  <v-card class="card">
    <v-card-title class="text">
      <v-spacer></v-spacer>
      <v-text-field
        v-model="search"
        append-icon=""
        label="Buscar"
        single-line
        hide-details
       >
    </v-text-field>
    </v-card-title>
    <v-data-table
      :headers="headers"
      :items="desserts"
      :search="search"
    ></v-data-table>
  </v-card>
 
</template>

<style lang="scss" scoped>
@use "@/scss/colors" as c;

.card{
  background-color: map-get(c.$colors,"light-purple");
  margin: 2vw;
  width: 90vw;
  height: 10vh;
  .text{
    width: 40vw;
  }
  img{
    width: 3vw;
  }
}


</style>