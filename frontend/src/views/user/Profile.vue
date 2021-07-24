<template>
  <div class="bg-gray-100 h-screen">
    <div class="container mx-auto  p-5">
      <div class="">
        <!-- Left Side -->
        <div class="w-full md:w-3/12 md:m-auto">
          <!-- Profile Card -->
          <div class="bg-white p-3 h-5/6 border-t-4">
            <div class="image overflow-hidden">
              <!-- Profile Image -->
              <img
                class="h-52 w-52 mx-auto"
                src=""
                alt=""
              />
            </div>
            <h1 class="text-gray-900 font-bold text-xl leading-8 my-1">
              @{{ username }}
            </h1>
            <!-- Intro -->
            <p class="text-sm text-gray-500 leading-6">{{ intro }}</p>
            <ul
              class="
                bg-gray-100
                text-gray-600
                hover:text-gray-700 hover:shadow
                py-2
                px-3
                mt-3
                divide-y
                rounded
                shadow-sm
              "
            >
              <li class="flex items-center py-3">
                <span>Status</span>
                <span class="ml-auto">
                  <!-- Status -->
                  <span
                    class="bg-green-500 py-1 px-2 rounded text-white text-sm"
                    >{{ status }}</span
                  ></span
                >
              </li>
              <li class="flex items-center py-3">
                <span class="text-sm">Member since : </span>
                <!-- RegDate -->
                <span class="ml-auto text-xs">{{ regData }}</span>
              </li>
            </ul>
          </div>
          <!-- End of profile card -->
        </div>

        <!-- Right Side -->
        <div class="w-full md:w-9/12 m-auto h-36 mt-6">
          <!-- About Section -->
          <div class="bg-white min-h-50 p-3 shadow-sm rounded-sm">
            <div
              class="
                flex
                items-center
                space-x-2
                font-semibold
                text-gray-900
                leading-8
              "
            >
              <span clas="text-green-500">
                <svg
                  class="h-5"
                  xmlns="http://www.w3.org/2000/svg"
                  fill="none"
                  viewBox="0 0 24 24"
                  stroke="currentColor"
                >
                  <path
                    stroke-linecap="round"
                    stroke-linejoin="round"
                    stroke-width="2"
                    d="M16 7a4 4 0 11-8 0 4 4 0 018 0zM12 14a7 7 0 00-7 7h14a7 7 0 00-7-7z"
                  />
                </svg>
              </span>
              <span class="tracking-wide">About</span>
            </div>
            <div class="text-gray-700">
              <div class="grid md:grid-cols-2 text-sm">
                <div class="grid grid-cols-2">
                  <div class="px-4 py-2 font-semibold">First Name</div>
                  <div class="px-4 py-2">{{ firstname }}</div>
                </div>
                <div class="grid grid-cols-2">
                  <div class="px-4 py-2 font-semibold">Last Name</div>
                  <div class="px-4 py-2">{{ lastname }}</div>
                </div>
                <div class="grid grid-cols-2">
                  <div class="px-4 py-2 font-semibold">Gender</div>
                  <div class="px-4 py-2">{{ gender }}</div>
                </div>
                <div class="grid grid-cols-2">
                  <div class="px-4 py-2 font-semibold">Email.</div>
                  <div class="px-4 py-2">
                    <a class="text-blue-800" href="mailto:${email}"
                      >{{ email }}</a
                    >
                  </div>
                </div>
              </div>
            </div>
          </div>
          <!-- End of About -->          
        </div>
      </div>
    </div>
  <!-- Edit -->
    <div class="flex justify-center">
      <button class="p-2 border w-1/4 rounded-md bg-gray-600 text-white">
        Edit My Profile
      </button>
    </div>
  </div>
</template>

<script>
  export default {
    name: "Profile",
    data() {
      return {
        username: 'Username',
        lastname: 'Lastname',
        firstname: 'Firstname',
        email: 'abc@gmail.com',
        gender: 'Gender',
        status: 'Status',
        regDate: 'Dec. 12, 2020',
        intro: 'Intro',
      };
    },
    props: {},
    methods: {},
  };
</script>

<style>
  :root {
    --main-color: #4a76a8;
  }

  .bg-main-color {
    background-color: var(--main-color);
  }

  .text-main-color {
    color: var(--main-color);
  }

  .border-main-color {
    border-color: var(--main-color);
  }
</style>
