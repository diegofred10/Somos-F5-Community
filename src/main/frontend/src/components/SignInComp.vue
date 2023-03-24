<script>
export default {
    data: () => ({
        valid: true,
        mail: '',
        mailRules: [
            v => !!v || 'Name is required',
            v => (v && v.length <= 10) || 'Name must be less than 10 characters',
        ],
        select: null,

        valid: true,
        password: '',
        passwordRules: [
            v => !!v || 'Password is required',
            v => (v && v.length <= 10) || 'Name must be less than 10 characters',
        ],
        select: null,
        // items: [
        //     'Item 1',
        //     'Item 2',
        //     'Item 3',
        //     'Item 4',
        // ],
        // checkbox: false,
    }),

    methods: {
        async validate() {
            const { valid } = await this.$refs.form.validate()

            if (valid) alert('Form is valid')
        },
        reset() {
            this.$refs.form.reset()
        },
        resetValidation() {
            this.$refs.form.resetValidation()
        },
    },
}
</script>

<template>
    <div class="logIn">
        <h1 class="headerForm">Bienvenido a SomosF5</h1>
        <v-sheet class="mx-auto">
            <v-form ref="form">
                <v-text-field v-model="mail" :counter="10" :rules="mailRules" label="Correo Electronico"
                    required></v-text-field>
                <v-text-field v-model="password" :counter="10" :rules="nameRules" label="Contraseña"
                    required></v-text-field>
                <v-text-field v-model="password" :counter="10" :rules="nameRules" label="Repetir contraseña"
                    required></v-text-field>
                <v-text-field v-model="password" :counter="10" :rules="nameRules" label="Codigo de verificacion"
                    required></v-text-field>

                <a class="passwordLink" href="">¿Has olvidado tu contraseña?</a>

                <div class="d-flex flex-column">
                    <v-btn class="mt-4" block @click="validate">
                        Enviar
                    </v-btn>
                </div>
            </v-form>
        </v-sheet>
        <img class="stringsPic" src="../assets/images/imagesSomosF5/rayas 1.png">
        <img class="blueTriangle1" src="../assets/images/imagesSomosF5/trianguloAzul 1.png">
        <img class="littleStar" src="../assets/images/imagesSomosF5/estrellaLila 2.png">
        <img class="brightTriangle" src="../assets/images/imagesSomosF5/trianguloSalmon 2.png">
        <img class="greenTriangle" src="../assets/images/imagesSomosF5/trianguloVerde 3.png">
        <img class="blueSplash" src="../assets/images/imagesSomosF5/manchaAzul 1.png">
    </div>
</template>

<style lang="scss">
.logIn {
    display: flex;
    flex-direction: column;
    align-items: center;
    margin-top: 15vh;

    .headerForm {
        font-size: 10vh;
        color: white;
    }

    .v-sheet {
        width: 40vw;

        .v-form {
            background-color: #FF4700;

            .v-input__control {
                background-color: white;
            }

            .passwordLink {
                color: white;
                display: flex;
                justify-content: center;
            }

            .d-flex.flex-column {
                width: 10vw;
                margin: auto;

                .v-btn {
                    color: white;
                    background-color: black;
                }
            }
        }
    }
    .stringsPic{
        position: absolute;
        right: 17vw;
        top: 17vh;
        height: 15vh;
        width: 15vw;
    }

    .blueTriangle1 {
        position: absolute;
        right: 1vw;
        top: 85vh;
        height: 55vh;
        width: 25vw;
    }

    .littleStar {
        position: absolute;
        right: 17vw;
        top: 90vh;
        height: 17vh;
        width: 11vw;
    }

    .brightTriangle {
        position: absolute;
        right: 21vw;
        top: 110vh;
        height: 30vh;
        width: 35vw;
    }

    .greenTriangle {
        position: absolute;
        right: 51vw;
        top: 110vh;
        height: 30vh;
        width: 28vw;
        z-index: 1;
    }
    .blueSplash{
        position: absolute;
        left: 0vw;
        top: 100vh;
        height: 40vh;
        width: 22vw;
    }
}
</style>