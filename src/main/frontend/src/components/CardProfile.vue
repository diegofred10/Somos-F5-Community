<script setup>
window.addEventListener('DOMContentLoaded', () => {
  const buttonDelete = document.querySelector('.button-delete');
  const buttonEdit = document.querySelector('.button-edit');
  const title = document.querySelector('.titlePubli');
  const text = document.querySelector('.textPubli');

  buttonDelete.addEventListener('click', () => {
    const publicacion = buttonDelete.closest('.card');
    publicacion.remove();
  });

  buttonEdit.addEventListener('click', () => {
    title.contentEditable = true;
    text.contentEditable = true;
    buttonEdit.style.display = 'none';
    const buttonSave = document.createElement('button');
    buttonSave.textContent = 'Guardar';
    buttonSave.classList.add('button-save');
    buttonEdit.parentNode.insertBefore(buttonSave, buttonEdit.nextSibling);
    buttonSave.addEventListener('click', () => {
      title.contentEditable = false;
      text.contentEditable = false;
      buttonSave.parentNode.removeChild(buttonSave);
      buttonEdit.style.display = 'block';
    });
  });
});


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
 
        </div>
      <div class="buttons">
        <button class="button-edit"><img src="../assets/images/imagesSomosF5/edit_FILL1_wght400_GRAD0_opsz48.png" alt=""></button>
        <button class="button-delete"><img src="../assets/images/imagesSomosF5/delete_FILL1_wght400_GRAD0_opsz48.png" alt=""></button>
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
            align-items: flex-end;
            .titleHeader{
                font-size: 2vw;
                color: map-get(c.$colors,"black");
                font-family: 'Open Sans', sans-serif ;
                font-weight: bold;
            }
            .date{
                color: map-get(c.$colors,"grey");
                font-family: 'Open Sans', sans-serif ;
                font-size: 1.5vw;
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
        
    }
            .buttons{          
                display: flex;
                justify-content: flex-end;
                .button-edit{
                    background-color: map-get(c.$colors,"light-purple");
                    border-radius: 5%;
                    width: 2.5vw;    
                    margin-top: 2%;                
                }

                .button-delete{
                    background-color: map-get(c.$colors,"light-purple");
                    border-radius: 5%;
                    width: 2.5vw;
                    margin-left: 2%;
                    margin-top: 2%;
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