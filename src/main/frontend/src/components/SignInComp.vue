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
                <div class="d-flex flex-column">
                    <v-btn class="mt-4" block @click="validate">
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
        top: 76.5vh;
        height: 70vh;
        width: 13vw;
        z-index: 1;
    }
    .blueSplash{
        position: absolute;
        left: 0vw;
        top: 85vh;
        height: 40vh;
        width: 22vw;
    }
}
</style>