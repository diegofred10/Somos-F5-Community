<script setup>
import { ref, reactive } from "vue";

import { useRouter } from "vue-router";
import AuthService from "../services/AuthService";
import { useAuthStore } from "../stores/authStore";
const auth = useAuthStore();
const router = useRouter();

const email = ref(""),
  emailRules = reactive([
    (v) => !!v || "Es necesario introducir un e-mail",
    (v) => /.+@.+/.test(v) || "Introduzca un e-mail válido",
  ]),
  password = ref(""),
  passwordRules = reactive([
    (v) => !!v || "Es necesario introducir una contraseña",
    (v) => v.length >= 8 || "La contraseña debe tener al menos 8 caracteres",

  ]);

const submitData = async () => {
  const authService = new AuthService();
  try {
    const role = await authService.login(email.value, password.value);
    auth.setRole(role);
    auth.setUsername(email.value);
    auth.setIsAuthenticated();
    router.push("/ProfileUser");
    console.log(auth.isAuthenticate, auth.roles, auth.username);
  } catch (error) {
    console.error(error);
    alert("No te conozco")
  }
  onReset();
};
</script>

<template>
  <div class="logIn">
    <h1 class="headerForm">Bienvenido a SomosF5</h1>
    <v-sheet class="mx-auto">
      <v-form id="loginForm" @submit.prevent="submitData">

        <v-text-field v-model="email" :rules="emailRules" label="Correo electrónico" required>
        </v-text-field>

        <v-text-field v-model="password" :rules="passwordRules" :type="show1 ? 'text' : 'password'" name="input-10-1" label="Contraseña" required>
        </v-text-field>

        <a class="passwordLink" href="">¿Has olvidado tu contraseña?</a>

        <div class="d-flex flex-column">
          <v-btn type="submit" class="mt-4" block @click="validate">
            Enviar
          </v-btn>
        </div>
      </v-form>
    </v-sheet>
    <div class="designLG">
        <img class="blueSplash" src="../assets/images/svgPics/blueSplash.svg" /> 
        <img class="littleStar" src="../assets/images/svgPics/littleStar.svg" />
        <img class="blueTriangle" src="../assets/images/svgPics/blueTriangle.svg" />
        </div>
  </div>
</template>

<style lang="scss">
@use "@/scss/colors" as c;
@use "@/scss/fonts";

.logIn {
  display: flex;
  flex-direction: column;
  align-items: center;
  margin-top: 7vh;

  .headerForm {
    color: map-get(c.$colors,"white");
    font-family: 'openSans';
    font-weight: bold;
    font-size: 6vh;
    align-self: center;
    margin: 2%;
  }

  .v-sheet {
    width: 35vw;

    .v-form {
      background-color:map-get(c.$colors,"orange"); 

      .v-input__control {
        background-color: map-get(c.$colors,"white");
        border-radius: 5px;
      }

      .passwordLink {
        color: map-get(c.$colors,"white");
        display: flex;
        justify-content: center;
      }

      .d-flex.flex-column {
        width: fit-content;
        margin: auto;

        .v-btn {
          color: map-get(c.$colors,"white");
          background-color:map-get(c.$colors,"black");
          z-index: 5;
        }
        .v-btn--size-default {
          min-width: 25vw;
        }
      }
    }
  }
  .designLG{
       display: flex;
       position: absolute;
       bottom: 0;
       width: 100%;
       height: 50%;
       justify-content: space-between;
       align-items: flex-end;

    .blueTriangle {
      height: 100%;
      width: 18%;
    }

    .littleStar {
      position: relative;     
      left: 30%;
      bottom: 35%;
      width: 12%;
    }

    .blueSplash {
      height: 85%;
      width: 25%;
    }
  }
}
</style>
