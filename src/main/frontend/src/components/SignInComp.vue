<script>
export default {
    data() {
        let checkCodeVar = "bienvenidos a la secta";
        return {
            email: '',
            emailRules: [
                v => !!v || 'E-mail is required',
                v => /.+@.+/.test(v) || 'E-mail must be valid',
            ],

            password: "",
            passwordRules: [
                v => !!v || "Password required",
                v => v.length >= 8 || 'Min 8 characters',
            ],

            confirmPassword: "",
            confirmPasswordRules: [
                v => !!v || "Confirm password",
                v => v === this.password || "Passwords do not match"
            ],

            checkCode: "",
            checkCodeRules: [
                v => v === checkCodeVar || "Alerta, intruso!"
            ]
        }
    },

    methods: {
        async validate() {
            const { valid } = await this.$refs.form.validate()

            if (valid) this.$router.push('/login')
        },
    },
}
</script>

<template>
    <div class="logIn">
        <h1 class="headerForm">Bienvenido a SomosF5</h1>
        <v-sheet class="mx-auto">
            <v-form v-model="valid" ref="form">
                <v-text-field v-model="email" :rules="emailRules" label="Correo Electronico" required></v-text-field>

                <v-text-field v-model="password" :rules="passwordRules" :type="show1 ? 'text' : 'password'"
                    name="input-10-1" label="Contraseña">
                </v-text-field>

                <v-text-field v-model="confirmPassword" :rules="confirmPasswordRules" :type="show1 ? 'text' : 'password'"
                    name="input-10-1" label="Repetir contraseña">
                </v-text-field>

                <v-text-field v-model="checkCode" :rules="checkCodeRules" label="Codigo de verificacion" required>
                </v-text-field>

                <div class="d-flex flex-column">
                    <v-btn type="submit" class="mt-4" block @click="validate">
                        Registrarse
                    </v-btn>
                </div>
            </v-form>
        </v-sheet>
        <img class="stringsPic" src="../assets/images/imagesSomosF5/rayas 1.png">
        <img class="blueTriangle" src="../assets/images/svgPics/blueTriangle.svg">
        <img class="littleStar" src="../assets/images/svgPics/littleStar.svg">
        <img class="pinkTriangle" src="../assets/images/svgPics/pinkTriangle.svg">
        <img class="greenTriangle" src="../assets/images/svgPics/greenTriangle.svg">
        <img class="blueSplash" src="../assets/images/svgPics/blueSplash.svg">
    </div>
</template>

<style lang="scss">
.logIn {
    display: flex;
    flex-direction: column;
    align-items: center;
    margin-top: 7vh;

    .headerForm {
        font-size: 7vh;
        color: white;
    }

    .v-sheet {
        width: 40vw;

        .v-form {
            background-color: #FF4700;

            .v-input__control {
                background-color: white;
                border-radius: 5px;
            }

            .passwordLink {
                color: white;
                display: flex;
                justify-content: center;
            }

            .d-flex.flex-column {
                width: fit-content;
                margin: auto;

                .v-btn {
                    color: white;
                    background-color: black;
                }
                .v-btn--size-default{
                    min-width: 25vw;
                }
            }
        }
    }

    .stringsPic {
        position: absolute;
        right: 29vw;
        top: 17vh;
        height: 7vh;
        width: 7vw;
    }

    .blueTriangle {
        position: absolute;
        right: 1vw;
        top: 70vh;
        height: 55vh;
        width: 25vw;
    }

    .littleStar {
        position: absolute;
        right: 17vw;
        bottom: 8vh;
        height: 20vh;
        width: 12vw;
    }

    .pinkTriangle {
        position: absolute;
        transform: rotate(90deg);
        right: 30vw;
        top: 72.5vh;
        height: 80vh;
        width: 12vw;
    }

    .greenTriangle {
        position: absolute;
        transform: rotate(-90deg);
        right: 55vw;
        top: 79.5vh;
        height: 70vh;
        width: 10vw;
        z-index: 1;
    }

    .blueSplash {
        position: absolute;
        left: 0vw;
        top: 85vh;
        height: 40vh;
        width: 22vw;
    }
}
</style>