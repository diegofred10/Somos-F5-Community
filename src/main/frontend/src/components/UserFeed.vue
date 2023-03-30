<script setup>

</script>

<template>
<div class="info">
    <div class="design">
        <img class="pigeon" src="https://uploads-ssl.webflow.com/62e2b7b9c42bdda27c83d493/6329c1bc61fe6a1ce2b9ac31_shape-3.svg" alt="">
        <h1 class="title">El muro</h1>
        <img class="circle" src="https://uploads-ssl.webflow.com/62e2b7b9c42bdda27c83d493/63b343dabc1dc0a6d0215d46_shape-3.svg" alt="">       
    </div>
    <div class="user">
      <div class="userData">
        <h2 class="name">Marco Polo</h2>
        <div class="contacts">
            <img class="logo" src="../assets/images/imagesSomosF5/geo-alt.png" alt="geo">
            <p class="contactsName">Castropol</p>
        </div>  
      </div>
      <div class="photoUser">
        <img class="imgProfile" src="../assets/images/imagesSomosF5/foto-perfil.png" alt="img">
      </div>
    </div>
</div>
</template>

<style lang="scss" scoped>
@use "@/scss/colors" as c;

.info{
background-color: map-get(c.$colors,"orange");
height: 20vh;
width: 90vw;
display: flex;
justify-content: space-between;
align-items: center;
margin-top: 2vw;
    .design{
    display: flex;
    align-items: center;
        .pigeon{
        position: relative;
        width: 12vw;
        margin-left: 2vw;
        }
        .title{
        font-size: 5vw;
        color: map-get(c.$colors,"white");
        font-family: 'Open Sans', sans-serif ;
        font-weight: bold;
        z-index: 2;
        right: 2vw;
        position: relative;
        }
        .circle{
        position: relative;
        width: 21vw; 
        right: 22vw;   
        -webkit-filter: grayscale(1);
        filter: grayscale(1);
        }

    }
    .user{
    display: flex;
    align-items: center;
          .userData{
            display: flex;
            flex-wrap: wrap;
            justify-content: flex-end;
            .name{
            font-size: 3vw;
            color: map-get(c.$colors,"white");
            font-family: 'Open Sans', sans-serif ;
            font-weight: bold;
            }
            .contacts{
            display: flex;
            float:left;
            margin-top: 2%;
            font-family: 'Open Sans', sans-serif ;
                .logo{
                width: 18%;
                }
                .contactsName{
                color: white;
                margin-left: 2%;
                }
            }


        }
        .photoUser{
        width: 18vh;
        margin-left: 3%;
        margin-right: 3%;
        .imgProfile{
            border-radius: 100%;
        }

        }
    }
}

</style>