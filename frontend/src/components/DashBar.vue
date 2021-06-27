<template>
  <div class="h-screen hidden lg:block my-4 ml-4 shadow-lg relative w-80">
    <div class="bg-white h-full mr-3 rounded-2xl dark:bg-gray-700">
      <div
        class="
          flex
          items-center
          justify-center
          pt-6
          font-bold
          hover:text-purple-500
        "
      >
        <h2>Dashboard</h2>
      </div>
      <div class="mt-6">
        <div>
          <router-link :to="{ name: 'Inbox' }"
            class="
              w-full
              font-thin
              uppercase
              text-gray-500
              dark:text-gray-200
              flex
              items-center
              p-4
              my-2
              transition-colors
              duration-200
              justify-start
              hover:text-blue-500
            "
            href="#"
          >
            <span class="text-left">
              <svg
                xmlns="http://www.w3.org/2000/svg"
                class="h-6 w-6 m-auto"
                fill="none"
                viewBox="0 0 24 24"
                stroke="currentColor"
              >
                <path
                  stroke-linecap="round"
                  stroke-linejoin="round"
                  stroke-width="2"
                  d="M17 8h2a2 2 0 012 2v6a2 2 0 01-2 2h-2v4l-4-4H9a1.994 1.994 0 01-1.414-.586m0 0L11 14h4a2 2 0 002-2V6a2 2 0 00-2-2H5a2 2 0 00-2 2v6a2 2 0 002 2h2v4l.586-.586z"
                />
              </svg>
            </span>
            <span class="mx-4 text-sm font-normal"> Inbox </span>
          </router-link>
          <router-link :to="{ name: 'Friends' }"
            class="
              w-full
              font-thin
              uppercase
              text-gray-500
              dark:text-gray-200
              flex
              items-center
              p-4
              my-2
              transition-colors
              duration-200
              justify-start
              hover:text-blue-500
            "
            href="#"
          >
            <span class="text-left">
              <svg
                xmlns="http://www.w3.org/2000/svg"
                class="h-6 w-6 m-auto"
                fill="none"
                viewBox="0 0 24 24"
                stroke="currentColor"
              >
                <path
                  stroke-linecap="round"
                  stroke-linejoin="round"
                  stroke-width="2"
                  d="M17 20h5v-2a3 3 0 00-5.356-1.857M17 20H7m10 0v-2c0-.656-.126-1.283-.356-1.857M7 20H2v-2a3 3 0 015.356-1.857M7 20v-2c0-.656.126-1.283.356-1.857m0 0a5.002 5.002 0 019.288 0M15 7a3 3 0 11-6 0 3 3 0 016 0zm6 3a2 2 0 11-4 0 2 2 0 014 0zM7 10a2 2 0 11-4 0 2 2 0 014 0z"
                />
              </svg>
            </span>
            <span class="mx-4 text-sm font-normal"> Friends </span>
          </router-link>

          <!-- Calandar -->
          <!-- <a
            class="
              w-full
              font-thin
              uppercase
              text-gray-500
              dark:text-gray-200
              flex
              items-center
              p-4
              my-2
              transition-colors
              duration-200
              justify-start
              hover:text-blue-500
            "
            href="#"
          >
            <span class="text-left">
              <svg
                xmlns="http://www.w3.org/2000/svg"
                class="h-6 w-6 m-auto"
                fill="none"
                viewBox="0 0 24 24"
                stroke="currentColor"
              >
                <path
                  stroke-linecap="round"
                  stroke-linejoin="round"
                  stroke-width="2"
                  d="M8 7V3m8 4V3m-9 8h10M5 21h14a2 2 0 002-2V7a2 2 0 00-2-2H5a2 2 0 00-2 2v12a2 2 0 002 2z"
                />
              </svg>
            </span>
            <span class="mx-4 text-sm font-normal"> Calendar </span>
          </a> -->

          <a
            class="
              w-full
              font-thin
              uppercase
              text-gray-500
              dark:text-gray-200
              flex
              items-center
              p-4
              my-2
              transition-colors
              duration-200
              justify-start
              hover:text-blue-500
            "
            href="#"
          >
            <span class="text-left">
              <svg
                xmlns="http://www.w3.org/2000/svg"
                class="h-6 w-6 m-auto"
                fill="none"
                viewBox="0 0 24 24"
                stroke="currentColor"
              >
                <path
                  stroke-linecap="round"
                  stroke-linejoin="round"
                  stroke-width="2"
                  d="M12 8v4m0 4h.01M21 12a9 9 0 11-18 0 9 9 0 0118 0z"
                />
              </svg>
            </span>
            <span class="mx-4 text-sm font-normal"> Reports </span>
          </a>
        </div>
      </div>
    </div>
  </div>
</template>

