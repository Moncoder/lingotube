<template>
  <div>
    <div class="header pb-8 pt-5 pt-lg-8 d-flex align-items-center profile-header"
        style="min-height: 600px;
        background-image: url(img/theme/profile-cover.jpg);
        background-size: cover;
        background-position: center top;">
      <b-container fluid>
        <!-- Mask -->
        <span class="mask bg-gradient-success opacity-8"></span>
        <!-- Header container -->
        <b-container fluid class="d-flex align-items-center">
          <b-row >
            <b-col lg="7" md="10">
              <h1 class="display-2 text-white">您好！</h1>
              <p class="text-white mt-0 mb-5">
                这是您的个人资料页面。
                您可以在这里编辑您的个人信息。
              </p>
            </b-col>
          </b-row>
        </b-container>
      </b-container>
    </div>

    <b-container fluid class="mt--6">
      <b-row>
        <b-col xl="8" class="order-xl-1">
          <edit-profile-form></edit-profile-form>
        </b-col>
        <b-col xl="4" class="order-xl-2 mb-5">
          <user-card></user-card>
        </b-col>
      </b-row>
    </b-container>
  </div>
</template>
<script>
  import EditProfileForm from './UserProfile/EditProfileForm.vue';
  import UserCard from './UserProfile/UserCard.vue';

  export default {
    components: {
      EditProfileForm,
      UserCard
    },
    data(){
      return{
        backgroundImage: ''
      };
    }
  };
</script>
<style>
</style>
