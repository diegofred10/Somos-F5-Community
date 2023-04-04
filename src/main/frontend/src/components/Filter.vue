<script setup>

</script>

<template>
  <v-card class="card">

      <v-spacer></v-spacer>
      <v-text-field
        v-model="search"
        append-icon=""
        label="Buscar"
        single-line
        hide-details
       >
    </v-text-field>

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
  margin-top: 1vw;
  width: 60vw;
  height: 7vh;
  .text{
    width: 40vw;

    label{
    font-family: 'Open Sans', sans-serif ;
    font-size: 2vw;
    }
  }
  img{
    width: 3vw;
  }
}


</style>