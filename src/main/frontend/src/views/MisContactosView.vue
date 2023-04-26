<script setup>
import Header from '../components/Header.vue';
import UserContacts from '../components/UserContacts.vue';
import CardUsers from '../components/CardUsers.vue';
import { ref, onBeforeMount } from 'vue';
import UserService from '../services/UserService';

const service = new UserService(); 


	const profile = ref();
  const user = ref()
	onBeforeMount(async () => {
	
    await service.fetchOneUser(2)
    user.value = service.getUser()
    console.log(user.value)
		try {
      const response = await axios.get(
				`http://localhost:8080/api/profiles/2`
			);
			console.log(response.data)
      profile.value = response.data
    } catch (error) {
      console.log(error)
    }
			
  })
</script>
<template>
<main>
    <Header/>
    <UserContacts/>
    <CardUsers
    :user = "user" :profile = "profile"/>
</main>
</template>
<style lang="scss">
@use "@/scss/colors" as c;
@use "@/scss/fonts";

main{
  margin: 0 auto;
  width: 80%;
  display: flex;
  justify-content: center;
  align-items: center;
  flex-direction: column;
}
</style>