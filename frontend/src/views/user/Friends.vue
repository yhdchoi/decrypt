<template>
  <div class="bg-gray-100 relative h-screen w-full overflow-hidden relative">
    <div class="items-start justify-between">
      <DashBar />

      <div class="ml-3 py-2 z-1">
        <div class="flex flex-wrap">
          <div class="w-full flex-none text-xs text-blue-700 font-medium">
            Shop
          </div>
          <h2 class="flex-auto text-lg font-medium">Massive Dynamic</h2>
        </div>
        <p class="mt-3"></p>
        <div class="flex py-4 text-sm text-gray-600">
          <div class="flex-1 inline-flex items-center">
            <svg
              xmlns="http://www.w3.org/2000/svg"
              class="h-5 w-5 mr-3"
              fill="none"
              viewBox="0 0 24 24"
              stroke="currentColor"
            >
              <path
                stroke-linecap="round"
                stroke-linejoin="round"
                stroke-width="2"
                d="M17.657 16.657L13.414 20.9a1.998 1.998 0 01-2.827 0l-4.244-4.243a8 8 0 1111.314 0z"
              ></path>
              <path
                stroke-linecap="round"
                stroke-linejoin="round"
                stroke-width="2"
                d="M15 11a3 3 0 11-6 0 3 3 0 016 0z"
              ></path>
            </svg>
            <p class="">Cochin,KL</p>
          </div>
          <div class="flex-1 inline-flex items-center">
            <svg
              xmlns="http://www.w3.org/2000/svg"
              class="h-5 w-5 mr-2"
              fill="none"
              viewBox="0 0 24 24"
              stroke="currentColor"
            >
              <path
                stroke-linecap="round"
                stroke-linejoin="round"
                stroke-width="2"
                d="M12 8v4l3 3m6-3a9 9 0 11-18 0 9 9 0 0118 0z"
              ></path>
            </svg>
            <p class="">05-25-2021</p>
          </div>
        </div>
        <div class="flex p-4 pb-2 border-t border-gray-200"></div>
        <div class="flex space-x-3 text-sm font-medium">
          <div class="flex-auto flex space-x-3">
            <button
              class="
                mb-2
                md:mb-0
                bg-white
                px-5
                py-2
                shadow-sm
                tracking-wider
                border
                text-gray-600
                rounded-full
                hover:bg-gray-100
                inline-flex
                items-center
                space-x-2
              "
            >
              <span class="text-green-400 hover:text-green-500 rounded-lg">
                <svg
                  aria-hidden="true"
                  focusable="false"
                  data-prefix="fab"
                  data-icon="shopify"
                  class="svg-inline--fa fa-shopify w-5 h-5"
                  role="img"
                  xmlns="http://www.w3.org/2000/svg"
                  viewBox="0 0 448 512"
                >
                  <path
                    fill="currentColor"
                    d="M388.32,104.1a4.66,4.66,0,0,0-4.4-4c-2,0-37.23-.8-37.23-.8s-21.61-20.82-29.62-28.83V503.2L442.76,472S388.72,106.5,388.32,104.1ZM288.65,70.47a116.67,116.67,0,0,0-7.21-17.61C271,32.85,255.42,22,237,22a15,15,0,0,0-4,.4c-.4-.8-1.2-1.2-1.6-2C223.4,11.63,213,7.63,200.58,8c-24,.8-48,18-67.25,48.83-13.61,21.62-24,48.84-26.82,70.06-27.62,8.4-46.83,14.41-47.23,14.81-14,4.4-14.41,4.8-16,18-1.2,10-38,291.82-38,291.82L307.86,504V65.67a41.66,41.66,0,0,0-4.4.4S297.86,67.67,288.65,70.47ZM233.41,87.69c-16,4.8-33.63,10.4-50.84,15.61,4.8-18.82,14.41-37.63,25.62-50,4.4-4.4,10.41-9.61,17.21-12.81C232.21,54.86,233.81,74.48,233.41,87.69ZM200.58,24.44A27.49,27.49,0,0,1,215,28c-6.4,3.2-12.81,8.41-18.81,14.41-15.21,16.42-26.82,42-31.62,66.45-14.42,4.41-28.83,8.81-42,12.81C131.33,83.28,163.75,25.24,200.58,24.44ZM154.15,244.61c1.6,25.61,69.25,31.22,73.25,91.66,2.8,47.64-25.22,80.06-65.65,82.47-48.83,3.2-75.65-25.62-75.65-25.62l10.4-44s26.82,20.42,48.44,18.82c14-.8,19.22-12.41,18.81-20.42-2-33.62-57.24-31.62-60.84-86.86-3.2-46.44,27.22-93.27,94.47-97.68,26-1.6,39.23,4.81,39.23,4.81L221.4,225.39s-17.21-8-37.63-6.4C154.15,221,153.75,239.8,154.15,244.61ZM249.42,82.88c0-12-1.6-29.22-7.21-43.63,18.42,3.6,27.22,24,31.23,36.43Q262.63,78.68,249.42,82.88Z"
                  ></path>
                </svg>
              </span>
              <span>62 Products</span>
            </button>
          </div>
          <button
            class="
              mb-2
              md:mb-0
              bg-gray-900
              px-5
              py-2
              shadow-sm
              tracking-wider
              text-white
              rounded-full
              hover:bg-gray-800
            "
            type="button"
            aria-label="like"
          >
            Edit Shop
          </button>
        </div>
      </div>

      <div class="">
        <div class="bg-white shadow-md rounded-3xl p-4">
          <div class="flex-none lg:flex">
            <div class="h-full w-full lg:h-48 lg:w-48 lg:mb-0 mb-3">
              <img
                src="https://images.unsplash.com/photo-1585399000684-d2f72660f092?ixid=MnwxMjA3fDF8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&amp;ixlib=rb-1.2.1&amp;auto=format&amp;fit=crop&amp;w=1951&amp;q=80"
                alt="Just a flower"
                class="
                  w-full
                  object-scale-down
                  lg:object-cover lg:h-48
                  rounded-2xl
                "
              />
            </div>
            <div class="flex-auto ml-3 justify-evenly py-2">
              <div class="flex flex-wrap">
                <div class="w-full flex-none text-xs text-blue-700 font-medium">
                  Shop
                </div>
                <h2 class="flex-auto text-lg font-medium">
                  Umbrella Corporation
                </h2>
              </div>
              <p class="mt-3"></p>
              <div class="flex py-4 text-sm text-gray-600">
                <div class="flex-1 inline-flex items-center">
                  <svg
                    xmlns="http://www.w3.org/2000/svg"
                    class="h-5 w-5 mr-3"
                    fill="none"
                    viewBox="0 0 24 24"
                    stroke="currentColor"
                  >
                    <path
                      stroke-linecap="round"
                      stroke-linejoin="round"
                      stroke-width="2"
                      d="M17.657 16.657L13.414 20.9a1.998 1.998 0 01-2.827 0l-4.244-4.243a8 8 0 1111.314 0z"
                    ></path>
                    <path
                      stroke-linecap="round"
                      stroke-linejoin="round"
                      stroke-width="2"
                      d="M15 11a3 3 0 11-6 0 3 3 0 016 0z"
                    ></path>
                  </svg>
                  <p class="">Mumbai,MH</p>
                </div>
                <div class="flex-1 inline-flex items-center">
                  <svg
                    xmlns="http://www.w3.org/2000/svg"
                    class="h-5 w-5 mr-2"
                    fill="none"
                    viewBox="0 0 24 24"
                    stroke="currentColor"
                  >
                    <path
                      stroke-linecap="round"
                      stroke-linejoin="round"
                      stroke-width="2"
                      d="M12 8v4l3 3m6-3a9 9 0 11-18 0 9 9 0 0118 0z"
                    ></path>
                  </svg>
                  <p class="">05-25-2021</p>
                </div>
              </div>
              <div class="flex p-4 pb-2 border-t border-gray-200"></div>
              <div class="flex space-x-3 text-sm font-medium">
                <div class="flex-auto flex space-x-3">
                  <button
                    class="
                      mb-2
                      md:mb-0
                      bg-white
                      px-5
                      py-2
                      shadow-sm
                      tracking-wider
                      border
                      text-gray-600
                      rounded-full
                      hover:bg-gray-100
                      inline-flex
                      items-center
                      space-x-2
                    "
                  >
                    <span
                      class="text-green-400 hover:text-green-500 rounded-lg"
                    >
                      <svg
                        aria-hidden="true"
                        focusable="false"
                        data-prefix="fab"
                        data-icon="shopify"
                        class="svg-inline--fa fa-shopify w-5 h-5"
                        role="img"
                        xmlns="http://www.w3.org/2000/svg"
                        viewBox="0 0 448 512"
                      >
                        <path
                          fill="currentColor"
                          d="M388.32,104.1a4.66,4.66,0,0,0-4.4-4c-2,0-37.23-.8-37.23-.8s-21.61-20.82-29.62-28.83V503.2L442.76,472S388.72,106.5,388.32,104.1ZM288.65,70.47a116.67,116.67,0,0,0-7.21-17.61C271,32.85,255.42,22,237,22a15,15,0,0,0-4,.4c-.4-.8-1.2-1.2-1.6-2C223.4,11.63,213,7.63,200.58,8c-24,.8-48,18-67.25,48.83-13.61,21.62-24,48.84-26.82,70.06-27.62,8.4-46.83,14.41-47.23,14.81-14,4.4-14.41,4.8-16,18-1.2,10-38,291.82-38,291.82L307.86,504V65.67a41.66,41.66,0,0,0-4.4.4S297.86,67.67,288.65,70.47ZM233.41,87.69c-16,4.8-33.63,10.4-50.84,15.61,4.8-18.82,14.41-37.63,25.62-50,4.4-4.4,10.41-9.61,17.21-12.81C232.21,54.86,233.81,74.48,233.41,87.69ZM200.58,24.44A27.49,27.49,0,0,1,215,28c-6.4,3.2-12.81,8.41-18.81,14.41-15.21,16.42-26.82,42-31.62,66.45-14.42,4.41-28.83,8.81-42,12.81C131.33,83.28,163.75,25.24,200.58,24.44ZM154.15,244.61c1.6,25.61,69.25,31.22,73.25,91.66,2.8,47.64-25.22,80.06-65.65,82.47-48.83,3.2-75.65-25.62-75.65-25.62l10.4-44s26.82,20.42,48.44,18.82c14-.8,19.22-12.41,18.81-20.42-2-33.62-57.24-31.62-60.84-86.86-3.2-46.44,27.22-93.27,94.47-97.68,26-1.6,39.23,4.81,39.23,4.81L221.4,225.39s-17.21-8-37.63-6.4C154.15,221,153.75,239.8,154.15,244.61ZM249.42,82.88c0-12-1.6-29.22-7.21-43.63,18.42,3.6,27.22,24,31.23,36.43Q262.63,78.68,249.42,82.88Z"
                        ></path>
                      </svg>
                    </span>
                    <span>62 Products</span>
                  </button>
                </div>
                <button
                  class="
                    mb-2
                    md:mb-0
                    bg-gray-900
                    px-5
                    py-2
                    shadow-sm
                    tracking-wider
                    text-white
                    rounded-full
                    hover:bg-gray-800
                  "
                  type="button"
                  aria-label="like"
                >
                  Edit Shop
                </button>
              </div>
            </div>
          </div>
        </div>
      </div>

      <!-- <section
        class="
          flex flex-col
          pt-3
          w-4/12
          bg-gray-50
          h-full
          rounded-2xl
          mr-3
          mt-4
        "
      >

        <ul class="mt-6">
          <li class="py-5 border-b px-3 transition hover:bg-indigo-100">
            <a href="#" class="flex justify-between items-center">
              <h3 class="text-lg font-semibold">Akhil Gautam</h3>
              <p class="text-md text-gray-400">23m ago</p>
            </a>
            <div class="text-md italic text-gray-400">
              You have been invited!
            </div>
          </li>          
        </ul>
      </section> -->

      <!-- <section class="w-3/5 px-4 flex flex-col bg-white rounded-2xl mr-3 mt-4">
        <div class="flex justify-between items-center h-48 border-b-2 mb-8">
          <div class="flex space-x-4 items-center">
            <div class="h-12 w-12 rounded-full overflow-hidden">
              <img
                src="https://bit.ly/2KfKgdy"
                loading="lazy"
                class="h-full w-full object-cover"
              />
            </div>
            <div class="flex flex-col">
              <h3 class="font-semibold text-lg">Akhil Gautam</h3>
              <p class="text-light text-gray-400">akhil.gautam123@gmail.com</p>
            </div>
          </div>
          <div>
            <ul class="flex text-gray-400 space-x-4">
              <li class="w-6 h-6">
                <svg
                  xmlns="http://www.w3.org/2000/svg"
                  fill="none"
                  viewBox="0 0 24 24"
                  stroke="currentColor"
                >
                  <path
                    stroke-linecap="round"
                    stroke-linejoin="round"
                    stroke-width="2"
                    d="M11 15l-3-3m0 0l3-3m-3 3h8M3 12a9 9 0 1118 0 9 9 0 01-18 0z"
                  />
                </svg>
              </li>
              <li class="w-6 h-6">
                <svg
                  xmlns="http://www.w3.org/2000/svg"
                  fill="none"
                  viewBox="0 0 24 24"
                  stroke="currentColor"
                >
                  <path
                    stroke-linecap="round"
                    stroke-linejoin="round"
                    stroke-width="2"
                    d="M13 9l3 3m0 0l-3 3m3-3H8m13 0a9 9 0 11-18 0 9 9 0 0118 0z"
                  />
                </svg>
              </li>

              <li class="w-6 h-6">
                <svg
                  xmlns="http://www.w3.org/2000/svg"
                  fill="none"
                  viewBox="0 0 24 24"
                  stroke="currentColor"
                >
                  <path
                    stroke-linecap="round"
                    stroke-linejoin="round"
                    stroke-width="2"
                    d="M17 17h2a2 2 0 002-2v-4a2 2 0 00-2-2H5a2 2 0 00-2 2v4a2 2 0 002 2h2m2 4h6a2 2 0 002-2v-4a2 2 0 00-2-2H9a2 2 0 00-2 2v4a2 2 0 002 2zm8-12V5a2 2 0 00-2-2H9a2 2 0 00-2 2v4h10z"
                  />
                </svg>
              </li>
              <li class="w-6 h-6">
                <svg
                  xmlns="http://www.w3.org/2000/svg"
                  fill="none"
                  viewBox="0 0 24 24"
                  stroke="currentColor"
                >
                  <path
                    stroke-linecap="round"
                    stroke-linejoin="round"
                    stroke-width="2"
                    d="M19 7l-.867 12.142A2 2 0 0116.138 21H7.862a2 2 0 01-1.995-1.858L5 7m5 4v6m4-6v6m1-10V4a1 1 0 00-1-1h-4a1 1 0 00-1 1v3M4 7h16"
                  />
                </svg>
              </li>
              <li class="w-6 h-6">
                <svg
                  xmlns="http://www.w3.org/2000/svg"
                  fill="none"
                  viewBox="0 0 24 24"
                  stroke="currentColor"
                >
                  <path
                    stroke-linecap="round"
                    stroke-linejoin="round"
                    stroke-width="2"
                    d="M5 5a2 2 0 012-2h10a2 2 0 012 2v16l-7-3.5L5 21V5z"
                  />
                </svg>
              </li>
            </ul>
          </div>
        </div>
        <section>
          <h1 class="font-bold text-2xl">We need UI/UX designer</h1>
          <article class="mt-8 text-gray-500 leading-7 tracking-wider">
            <p>Hi Akhil,</p>
            <p>
              Design and develop enterprise-facing UI and consumer-facing UI as
              well as REST API backends.Work with Product Managers and User
              Experience designers to create an appealing user experience for
              desktop web and mobile web.
            </p>
            <footer class="mt-12">
              <p>Thanks & Regards,</p>
              <p>Alexandar</p>
            </footer>
          </article>
          <ul class="flex space-x-4 mt-12">
            <li
              class="
                w-10
                h-10
                border
                rounded-lg
                p-1
                cursor-pointer
                transition
                duration-200
                text-indigo-600
                hover:bg-blue-100
              "
            >
              <svg
                xmlns="http://www.w3.org/2000/svg"
                fill="none"
                viewBox="0 0 24 24"
                stroke="currentColor"
              >
                <path
                  stroke-linecap="round"
                  stroke-linejoin="round"
                  stroke-width="1"
                  d="M9 13h6m-3-3v6m-9 1V7a2 2 0 012-2h6l2 2h6a2 2 0 012 2v8a2 2 0 01-2 2H5a2 2 0 01-2-2z"
                />
              </svg>
            </li>
            <li
              class="
                w-10
                h-10
                border
                rounded-lg
                p-1
                cursor-pointer
                transition
                duration-200
                text-blue-800
                hover:bg-blue-100
              "
            >
              <svg
                xmlns="http://www.w3.org/2000/svg"
                fill="none"
                viewBox="0 0 24 24"
                stroke="currentColor"
              >
                <path
                  stroke-linecap="round"
                  stroke-linejoin="round"
                  stroke-width="1"
                  d="M7 4v16M17 4v16M3 8h4m10 0h4M3 12h18M3 16h4m10 0h4M4 20h16a1 1 0 001-1V5a1 1 0 00-1-1H4a1 1 0 00-1 1v14a1 1 0 001 1z"
                />
              </svg>
            </li>
            <li
              class="
                w-10
                h-10
                border
                rounded-lg
                p-1
                cursor-pointer
                transition
                duration-200
                text-pink-400
                hover:bg-blue-100
              "
            >
              <svg
                xmlns="http://www.w3.org/2000/svg"
                fill="none"
                viewBox="0 0 24 24"
                stroke="currentColor"
              >
                <path
                  stroke-linecap="round"
                  stroke-linejoin="round"
                  stroke-width="1"
                  d="M7 4v16M17 4v16M3 8h4m10 0h4M3 12h18M3 16h4m10 0h4M4 20h16a1 1 0 001-1V5a1 1 0 00-1-1H4a1 1 0 00-1 1v14a1 1 0 001 1z"
                />
              </svg>
            </li>
            <li
              class="
                w-10
                h-10
                border
                rounded-lg
                p-1
                cursor-pointer
                transition
                duration-200
                text-yellow-500
                hover:bg-blue-100
              "
            >
              <svg
                xmlns="http://www.w3.org/2000/svg"
                fill="none"
                viewBox="0 0 24 24"
                stroke="currentColor"
              >
                <path
                  stroke-linecap="round"
                  stroke-linejoin="round"
                  stroke-width="1"
                  d="M17.657 18.657A8 8 0 016.343 7.343S7 9 9 10c0-2 .5-5 2.986-7C14 5 16.09 5.777 17.656 7.343A7.975 7.975 0 0120 13a7.975 7.975 0 01-2.343 5.657z"
                />
                <path
                  stroke-linecap="round"
                  stroke-linejoin="round"
                  stroke-width="2"
                  d="M9.879 16.121A3 3 0 1012.015 11L11 14H9c0 .768.293 1.536.879 2.121z"
                />
              </svg>
            </li>
          </ul>
        </section>
        <section class="mt-6 border rounded-xl bg-gray-50 mb-3">
          <textarea
            class="w-full bg-gray-50 p-2 rounded-xl"
            placeholder="Type your reply here..."
            rows="3"
          ></textarea>
          <div class="flex items-center justify-between p-2">
            <button class="h-6 w-6 text-gray-400">
              <svg
                xmlns="http://www.w3.org/2000/svg"
                fill="none"
                viewBox="0 0 24 24"
                stroke="currentColor"
              >
                <path
                  stroke-linecap="round"
                  stroke-linejoin="round"
                  stroke-width="2"
                  d="M15.172 7l-6.586 6.586a2 2 0 102.828 2.828l6.414-6.586a4 4 0 00-5.656-5.656l-6.415 6.585a6 6 0 108.486 8.486L20.5 13"
                />
              </svg>
            </button>
            <button class="bg-purple-600 text-white px-6 py-2 rounded-xl">
              Reply
            </button>
          </div>
        </section>
      </section> -->
    </div>
  </div>
</template>

<script>
  import DashBar from "../../components/DashBar.vue";

  export default {
    name: "Dashboard",
    components: { DashBar },
  };
</script>
