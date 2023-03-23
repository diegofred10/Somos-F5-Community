<script>

</script>
<template>
    <div id="logIn">
        <h1 id="headerForm">Bienvenido a SomosF5</h1>
        <form id="logInForm" action="">
            <p>
                <label id="mailLabel">Correo Electronico</label>
                <input id="mailInput" v-model="mail" type="text" name="mail">
            </p>
            <p>
                <label id="passwordLabel">Contraseña</label>
                <input id="passwordInput" v-model="password" type="password" name="password">
            </p>
            <p>
                <input id="submitButton" type="submit" value="Enviar">
            </p>
        </form>
    </div>
</template>
<style lang="scss">
    #logIn{
        display: flex;
        flex-direction: column;
        align-items: center;
        #headerForm{
            font-size: 10vh;
            color: white;
        }
        #logInForm{
            #mailLabel{
                display: flex;
                justify-content: center;
            }
            #mailInput{
                background-color: white;
            }
            #passwordLabel{
                display: flex;
                justify-content:center;
            }
            #passwordInput{
                background-color: white;
            }
            #submitButton{
                display: flex;
                justify-content: center;
            }
        }

    }


</style>

