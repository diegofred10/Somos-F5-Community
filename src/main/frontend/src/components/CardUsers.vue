<script setup>
    import axios from 'axios';
    let random = Math.round(Math.random()*2+1);
    let image = "src/assets/images/separator" + random + ".png";
</script>

<template>
 <section class="card-u">
    <div class="info-u">
        <img class="img-u" src="../assets/images/imagesSomosF5/Alicia.jpeg" alt="">
        <div class="date-u">
           <h1 class="name-u">Alicia Fernández</h1>
           <div class="contact-u">
                <i class="fa-regular fa-envelope logo-u" style="color: #000000;"></i>
                <p class="text-u">alicia_fernandez@gmail.com</p>
           </div>
           <div class="contact-u">
                <i class="fa-solid fa-location-dot" style="color: #000000;"></i>
                <p class="text-u">Gijón, Asturias</p>
           </div>
        </div>
    </div>
    <!-- <button>
        <i class="fa-regular fa-trash-can fa-2xl trash-u" style="color: #000000;"></i>
    </button> -->
    <button class="btn-u">
        ELIMINAR DE MIS CONTACTOS
    </button>
 </section>
 <div class="separator-u" id="separator">
        <img class="stripe-u" :src="image" alt="Línea separadora de color morado.">
 </div> 
</template>

<style lang="scss">
@use "@/scss/colors" as c;
@use "@/scss/fonts";


.card-u{
    background-color: #FEF0DC;
    width: 80%;
    margin-top: 2%;
    display: flex;
    align-items: flex-end;
    justify-content: space-around;

    .info-u{
        display: flex;
        align-items: center;

        .img-u{
            border-radius: 100%;
            width: 15%;
            margin: 1% 3% 1% 5%;
        }
        .date-u{
            margin-top: 1%;
            
            .name-u{
             font-family: 'Open Sans', sans-serif ;
             font-weight: bold;
             font-size: 1.8vw;
            }
            .contact-u{
                display: flex;
                align-items: center;

                i{
                    margin: 1%;
                    
                }
            }
        }
    }
    
    // button{
    //     display: flex;
    //     justify-content: flex-end;
    //     width: 6%;
    //     height: 10%;
    // } 

    .btn-u{
        background-color: map-get(c.$colors, "orange");
        color: map-get(c.$colors, "white");
        font-family: 'Open Sans', sans-serif ;
        font-size: 60%;
        width: 22%;
        height: 90%;
        border: solid;
        box-sizing: border-box;
        border-radius: 50px;
        margin: 1%;
            &:hover {
            background-color: map-get(c.$colors, "white");
            color: map-get(c.$colors, "orange");
        }
    }
}

.separator-u{
    display: flex;
    justify-content: center;
    align-items: end;
    margin: 2vw;

    .stripe-u{
    width: 60vw; 
    height: 4vh;
        }
    }
</style>