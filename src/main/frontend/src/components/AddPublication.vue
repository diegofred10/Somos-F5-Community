<script setup>
import { ref } from 'vue';
const dialog = ref(false)

</script>

<template>
  <div class="add">
    <v-btn class="title" @click="dialog = true">Añadir publicación</v-btn>
    <p class="icon">+</p>
  </div>
  <v-row class="postForm" justify="center">
    <v-dialog color="orange" v-model="dialog" persistent width="600">
      <!-- <v-slot:activator="{ props }"> -->
      <v-card>
        <v-card-title class="titlePostForm">
          <span class="text-h5">Añade titulo a tu publicacion</span>
        </v-card-title>
        <v-card-text>
          <v-container>
            <v-row>
              <v-col cols="12">
                <v-text-field></v-text-field>
              </v-col>
              <v-col cols="12">
                <v-text-field required></v-text-field>
              </v-col>
            </v-row>
          </v-container>
          <small>*indicates required field</small>
        </v-card-text>
        <v-card-actions>
          <v-spacer></v-spacer>
          <v-btn color="blue-darken-1" variant="text" @click="dialog = false">
            Close
          </v-btn>
          <v-btn color="orange" variant="text" @click="dialog = false">
            Save
          </v-btn>
        </v-card-actions>
      </v-card>
    </v-dialog>
  </v-row>
</template>

<style lang="scss" scoped>
@use "@/scss/colors" as c;

.add {
  width: 60vw;
  height: 7vh;
  margin-top: 2vw;
  display: flex;
  justify-content: space-between;
  justify-self: center;
  align-items: center;
  background-color: map-get(c.$colors, "orange");
  border: 3px solid map-get(c.$colors, "grey");

  .title {
    font-size: 1.8vw;
    color: map-get(c.$colors, "grey");
    font-family: 'Open Sans', sans-serif;
    margin-left: 1vw;
  }

  .icon {
    font-size: 3vw;
    color: map-get(c.$colors, "black");
    font-family: 'Open Sans', sans-serif;
    font-weight: bold;
    margin-right: 2vw;
    margin-bottom: 1%;
  }
}

.v-card {
  .v-text-field {
    background-color: white;

    .v-input__details {
      display: none;
      font-size: 0;
      font-weight: 0;
      grid-area: none;
      letter-spacing: 0;
      line-height: 0%;
      min-height: 0px;
      padding-top: 0px;
      overflow: hidden;
    }
  }

  .v-card-text {
    background-color: orange;
  }
}
</style>