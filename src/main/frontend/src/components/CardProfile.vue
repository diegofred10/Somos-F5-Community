<script setup>
import ButtonsProfile from './ButtonsProfile.vue';
</script>

<template>
<div class="card">
    <div class="info">
        <div class="headerCard">
        <h2 class="titleHeader">Simulador certificación</h2>
        <p class="date">24-06-2022</p>
        </div>
        <div class="publication">
            <h2 class="titlePubli">Simulador certificación</h2>
            <p class="textPubli">Lorem ipsum dolor sit amet consectetur adipisicing elit. Fuga atque fugiat optio veniam vero illo recusandae consequuntur, minima iure corrupti pariatur sapiente nobis id ea. Quia saepe necessitatibus aspernatur laborum.</p>
             <div class="buttons">
               <ButtonsProfile/>
             </div>   
        </div>
    </div>


</div>
<div class="separator">
    <img class="stripe" src="../assets/images/imagesSomosF5/franjaMorada 2.png" alt="">
</div>
</template>

<style lang="scss" scoped>
@use "@/scss/colors" as c;

.card{
display: flex;
align-items: center;
justify-content: center;
flex-direction: column;
margin-top: 2vw;
    .info{
 display: flex;
 justify-content: center;
 flex-direction: column;
        .headerCard{
            display: flex;
            text-align: center;
            justify-content: space-between;
            align-items: center;
            .titleHeader{
                font-size: 2vw;
                color: map-get(c.$colors,"black");
                font-family: 'Open Sans', sans-serif ;
                font-weight: bold;
            }
            .date{
                color: map-get(c.$colors,"grey");
                font-family: 'Open Sans', sans-serif ;
                font-size: 2vw;
            }
        }
        .publication{
            background-color: map-get(c.$colors,"white");
            border: 3px solid map-get(c.$colors,"grey");
            width: 120vh;
            .titlePubli{
                font-size: 1.5vw;
                color: map-get(c.$colors,"black");
                font-family: 'Open Sans', sans-serif ;
                font-weight: 600;
                margin-left: 2%;
                margin-top: 1%;
            }
            .textPubli{
                font-family: 'Open Sans', sans-serif ;
                margin-left: 2%;
                margin-top: 1%;
            }

        }
        
    }
    .buttons{
       
        display: flex;
        justify-content: flex-end;
    }
}

.separator{
 display: flex;
 justify-content: center;
  .stripe{
   width: 70vw; 
  }
 
}



</style>