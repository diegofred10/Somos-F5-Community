<script setup>
import { ref, reactive, computed, onBeforeMount, onBeforeUpdate } from "vue";
import axios from "axios";
import { useAuthStore } from "../stores/AuthStore";

const store = useAuthStore();
const url = ref("");
const user = ref("");
const profile = ref("");
const nameModel = ref("");
const githubModel = ref("");
const linkedinModel = ref("");
const locationModel = ref("");
const imageUrl = computed(() => url.value);
let readOnly = ref(true);

const onFileChange = (event) => {
  const file = event.target.files[0];
  if (file) {
    const formData = new FormData();
    formData.append("file", file);
    axios({
      method: "POST",
      url: "http://localhost:8080/media/upload",
      data: formData,
      withCredentials: true,
    })
      .then((response) => {
        url.value = response.data.url;
      })
      .catch((e) => {
        console.log(e);
        console.log("Catch error upload");
      });
  }
  window.location.reload();
};

onBeforeMount(() => {
  axios({
    method: "GET",
    url: "http://localhost:8080/api/users/" + store.id,
    withCredentials: true,
  })
    .then((response) => {
      user.value = response.data;
    })
    .catch((e) => {
      console.log(e);
      console.log(store.id);
      console.log("Catch error profile");
    });
});

const submit = async () => {
  console.log("soy submit");
  readOnly.value = true;
  console.log(readOnly.value);
  try {
    const profile = {
      name: nameModel.value,
      github: githubModel.value,
      linkedin: linkedinModel.value,
      location: locationModel.value,
    };
        store.name = profile.name,
      store.github = profile.github,
      store.linkedin = profile.linkedin,
      store.location = profile.location,
      await axios({
        method: "PUT",
        url: "http://localhost:8080/api/profiles/update/" + store.id,
        data: profile,
        withCredentials: true,
      });
  } catch (error) {
    console.log("submit error" + error);
  }
};


onBeforeUpdate(() => {
  axios({
    method: "GET",
    url: "http://localhost:8080/api/profiles/" + store.id,
    withCredentials: true,
  })
    .then((response) => {
      profile.value = response.data;
    })
    .catch((e) => {
      console.log(e);
      console.log("Catch error profile");
    });
});
</script>

<template>
  <div class="infoUser">
    <div class="photoAndContact">
      <input
        type="file"
        @change="onFileChange"
        ref="fileInput"
        style="display: none"
      />
      <img
        @click="$refs.fileInput.click()"
        class="photoUser"
        v-if="user.image != null"
        :src="'http://localhost:8080/media/' + user.image"
        alt="img"
      />
      <img
        @click="$refs.fileInput.click()"
        class="photoUser"
        v-else
        src="../assets/images/perfilVacio.png"
        alt="img"
      />
      <div class="contacts">
        <div class="contact">
          <input
            v-model="nameModel"
            v-if="store.name == ''"
            placeholder="Nombre"
            class="name"
            :readonly="readOnly"
          />
          <input
            v-model="nameModel"
            v-else
            :placeholder="store.name"
            class="name"
            :readonly="readOnly"
          />
        </div>
        <div class="contact">
          <img
            class="logo"
            src="../assets/images/imagesSomosF5/github.png"
            alt="gitHub"
          />
          <input
            v-model="githubModel"
            v-if="store.github == ''"
            placeholder="GitHub"
            class="contactsName"
            :readonly="readOnly"
          />
          <input
            v-model="githubModel"
            v-else
            :placeholder="store.github"
            class="contactsName"
            :readonly="readOnly"
          />
        </div>
        <div class="contact">
          <img
            class="logo"
            src="../assets/images/imagesSomosF5/linkedin.png"
            alt="linkedin"
          />
          <input
            v-model="linkedinModel"
            v-if="store.linkedin == ''"
            placeholder="LinkedIn"
            class="contactsName"
            :readonly="readOnly"
          />
          <input
            v-model="linkedinModel"
            v-else
            :placeholder="store.linkedin"
            class="contactsName"
            :readonly="readOnly"
          />
        </div>
        <div class="contact">
          <img
            class="logo"
            src="../assets/images/imagesSomosF5/geo-alt.png"
            alt="geo"
          />
          <input
            v-model="locationModel"
            v-if="store.location == '' || store.location == null"
            placeholder="Ubicación"
            class="contactsName"
            :readonly="readOnly"
          />
          <input
            v-model="locationModel"
            v-else
            :placeholder="store.location"
            class="contactsName"
            :readonly="readOnly"
          />
        </div>
        <div class="contact">
          <img
            class="logo"
            src="../assets/images/imagesSomosF5/Vector.png"
            alt="email"
          />
          <input
            :placeholder="user.username"
            class="contactsName"
            :readonly="true"
          />
        </div>
        <button
          v-if="readOnly == true"
          @click="readOnly = false"
          class="buttonEdit"
        >
          EDITAR PERFIL
        </button>
        <button
          v-if="readOnly == false"
          @click="submit"
          class="buttonSave"
        >
          GUARDAR CAMBIOS
        </button>
      </div>
    </div>

    <div class="design">
      <img
        class="bannerDesing"
        src="../assets/images/imagesSomosF5/banner.png"
        alt=""
      />
      <button class="addContacts">AÑADIR A MIS CONTACTOS</button>
    </div>
  </div>
</template>

<style lang="scss" scoped>
@use "@/scss/colors" as c;
@use "@/scss/fonts";

.infoUser {
  width: 100%;
  background-color: map-get(c.$colors, "orange");
  display: flex;
  align-items: center;
  justify-content: space-evenly;

  .photoAndContact {
    display: flex;
    width: 70%;
    align-items: center;

    .photoUser {
      border-radius: 100%;
      width: 20%;
      margin: 2%;
      cursor: pointer;
    }
    .contacts {
      width: 80%;
      display: flex;
      flex-direction: column;
      .name {
        width: 100%;
        font-size: 2em;
        color: map-get(c.$colors, "white");
        font-family: "openSans";
        font-weight: bold;
        margin-left: 1%;
      }
      .contact {
        width: 100%;
        display: flex;
        flex-direction: row;
        align-items: center;
        font-family: "openSans";
        margin-bottom: 0.5em;

        .logo {
          width: 5%;
          margin-right: 1%;
        }
        .contactsName {
          color: white;
          width: 100%;
          font-size: 1em;
          margin-left: 2%;
        }
        input {
          color: white;
          border: 0;
          outline: none;
          &::placeholder {
            color: white;
          }
        }
      }
      .buttonEdit {
        width: 20%;
        border: solid;
        box-sizing: border-box;
        border-radius: 50px;
        border-color: map-get(c.$colors, "white");
        color: map-get(c.$colors, "orange");
        background-color: map-get(c.$colors, "white");
        font-family: "openSans";
        font-weight: bold;
        font-size: 70%;
        text-align: center;
        margin-bottom: 1%;
        &:hover {
            background-color: map-get(c.$colors, "orange");
            color: map-get(c.$colors, "white");
        }
      }
      .buttonSave {
        width: 20%;
        border: solid;
        box-sizing: border-box;
        border-radius: 50px;
        color: map-get(c.$colors, "white");
        // background-color: map-get(c.$colors, "grey-blue");
        background-color: rgb(102, 102, 102);
        font-family: "openSans";
        font-weight: bold;
        font-size: 70%;
        text-align: center;
        margin-bottom: 1%;
        &:hover {
            background-color: map-get(c.$colors, "white");
            color: map-get(c.$colors, "black");
        }
      }
    }
  }
  .design {
    width: 30%;
    display: flex;
    flex-direction: column;
    flex-wrap: wrap;
    align-content: center;
    align-items: center;

    .bannerDesing {
      width: 100%;
    }
    .addContacts {
      width: 40%;
      border: solid;
      box-sizing: border-box;
      border-radius: 50px;
      color: map-get(c.$colors, "white");
      font-family: "openSans";
      font-weight: bold;
      font-size: 70%;
      text-align: center;
      margin-bottom: 1%;
      &:hover {
        background-color: map-get(c.$colors, "white");
        color: map-get(c.$colors, "orange");
      }
    }
  }
}
</style>
