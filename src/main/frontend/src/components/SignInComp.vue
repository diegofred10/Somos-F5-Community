<script setup>
import { ref, reactive } from "vue";
import AuthService from "../services/AuthService";
import { useRouter } from "vue-router";

let checkCodeVar = "bienvenidos a la secta";

const router = useRouter();

const email = ref(""),
  emailRules = reactive([
    (v) => !!v || "E-mail is required",
    (v) => /.+@.+/.test(v) || "E-mail must be valid",
  ]),
  password = ref(""),
  passwordRules = reactive([
    (v) => !!v || "Password required",
    (v) => v.length >= 8 || "Min 8 characters",
  ]),
  confirmPassword = ref(""),
  confirmPasswordRules = reactive([
    (v) => !!v || "Confirm password",
    (v) => v === password.value || "Passwords do not match",
  ]),
  checkCode = ref(""),
  checkCodeRules = reactive([(v) => v === checkCodeVar || "Alerta, intruso!"]);


const submitData = async () => {
 
    const authService = new AuthService();
    if(email.value && password.value != null){
        try {
        const response = await authService.register(email.value, password.value);
        alert("Registrado con exito");
        router.push("/login");
    } catch (error) {
        console.error(error);
    }
    }
    else{
        alert("Debes rellenar todos los campos");
    }
};

       
    
</script>

<template>
    <div class="signIn">
        <h1 class="headerForm">Bienvenido a SomosF5</h1>
        <v-sheet class="mx-auto">
            <v-form v-model="valid" @submit.prevent="submitData">
                <v-text-field v-model="email" :rules="emailRules" label="Correo Electronico" required></v-text-field>

                <v-text-field v-model="password" :rules="passwordRules" :type="show1 ? 'text' : 'password'"
                    name="input-10-1" label="Contraseña" required>
                </v-text-field>

                <v-text-field v-model="confirmPassword" :rules="confirmPasswordRules" :type="show1 ? 'text' : 'password'"
                    name="input-10-1" label="Repetir contraseña" required>
                </v-text-field>

        <v-text-field
          v-model="checkCode"
          :rules="checkCodeRules"
          label="Codigo de verificacion"
          required
        >
        </v-text-field>

                <div class="d-flex flex-column">
                    <v-btn type="submit" class="mt-4" block @click="validate">
                        Registrarse
                    </v-btn>
                </div>
            </v-form>
        </v-sheet>
        <div class="design">
        <img class="blueSplash" src="../assets/images/svgPics/blueSplash.svg" />       
        <!-- <img class="greenTriangle" src="../assets/images/svgPics/greenTriangle.svg" />       -->
        <!-- <img class="pinkTriangle" src="../assets/images/svgPics/pinkTriangle.svg" /> -->
        <img class="littleStar" src="../assets/images/svgPics/littleStar.svg" />
        <img class="blueTriangle" src="../assets/images/svgPics/blueTriangle.svg" />
        </div>
    </div>
</template>

<style lang="scss">
@use "@/scss/colors" as c;
@use "@/scss/fonts";

.signIn {
    display: flex;
    flex-direction: column;
    align-items: center;
    margin-top: 3vh;

    .headerForm {
        color: map-get(c.$colors,"white");
        font-family: 'openSans';
        font-weight: bold;
        font-size: 8vh;
    }

    .v-sheet {
        width: 30vw;
        margin-top: 3vh;

        .v-form {
            background-color: map-get(c.$colors,"orange");
            display: flex;
            flex-direction: column;
            height: 60%;



            .v-input__control {
                background-color: white;
                border-radius: 5px;
                z-index: 2;
            }

            .v-input__details {
                z-index: 5;
                margin-bottom: 1.5vw;

                .v-messages__message {
                    color: #FED2C0;     
                }
            }

            .passwordLink {
                color: white;
                display: flex;
                justify-content: center;
                z-index: 2;

            }

            .d-flex.flex-column {
                width: fit-content;
                margin: auto;


                .v-btn {
                    color: white;
                    background-color: black;
                    z-index: 2;

                }

                .v-btn--size-default {
                    min-width: 25vw;
                }
            }
        }
    }

     .design{
       display: flex;
       position: absolute;
       bottom: 0;
       width: 100%;
       height: 50%;
       justify-content: space-between;
       align-items: flex-end;

        .blueTriangle {
             height: 110%;
             width: 18%;
        }

        .littleStar {     
            position: relative;     
            left: 30%;
            bottom: 35%;
            height: 55%;
            width: 15%;
         }

        // .pinkTriangle {
        //     // position: relative;
           
        //     transform: rotate(90deg);
        //     // right: 30vw;
        //       height: 20vh;
        //       width: 12vw;
        // }

        // .greenTriangle {
        //     //  position: relative;
            
        //      transform: rotate(-90deg);
        //     // right: 55vw;
        //     //  height: 70vh;
        //     //  width: 10vw;
        //      z-index: 1;
        // }

        .blueSplash {
            height: 45vh;
            width: 25vw;
        }
     }
}
</style>
