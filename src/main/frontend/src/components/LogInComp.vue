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
                <v-text-field v-model="mail" :counter="10" :rules="mailRules" label="Correo Electronico" required></v-text-field>
                <v-text-field v-model="password" :counter="10" :rules="nameRules" label="Contraseña" required></v-text-field>
                <div class="d-flex flex-column">
                    <v-btn color="success" class="mt-4" block @click="validate">
                        Validate
                    </v-btn>
                </div>
            </v-form>
        </v-sheet>
    </div>
</template>

<style lang="scss">
.logIn {
    display: flex;
    flex-direction: column;
    align-items: center;

    .headerForm {
        font-size: 10vh;
        color: white;
    }
    .v-sheet{
        width: 40vw;
        .v-form{
            background-color: #FF4700;
            .v-input__control{
                background-color: white;
            }
        }
    }
}
</style>

