<template>
  <!-- Terminal -->
  <div class="max-h-screen my-10 flex justify-center items-center">
    <div
      class="w-2/3 text-gray-300 rounded-t shadow-lg overflow-hidden text-xs"
    >
      <div
        class="
          h-8
          flex
          items-center
          p-2
          justify-between
          bg-gradient-to-b
          from-gray-700
          to-gray-800
        "
      >
        <div class="flex items-center gap-1">
          <svg
            class="w-5 h-5 cursor-pointer"
            fill="none"
            stroke="currentColor"
            viewBox="0 0 24 24"
            xmlns="http://www.w3.org/2000/svg"
          >
            <path
              stroke-linecap="round"
              stroke-linejoin="round"
              stroke-width="2"
              d="M8 9l3 3-3 3m5 0h3M5 20h14a2 2 0 002-2V6a2 2 0 00-2-2H5a2 2 0 00-2 2v12a2 2 0 002 2z"
            ></path>
          </svg>
          <span class="font-bold select-none">Terminal</span>
        </div>
        <div class="flex items-center gap-1">
          <svg
            class="w-4 h-4 cursor-pointer hover:text-red-400"
            fill="none"
            stroke="currentColor"
            viewBox="0 0 24 24"
            xmlns="http://www.w3.org/2000/svg"
          >
            <path
              stroke-linecap="round"
              stroke-linejoin="round"
              stroke-width="2"
              d="M19 9l-7 7-7-7"
            ></path>
          </svg>
          <svg
            class="w-4 h-4 cursor-pointer hover:text-red-400"
            fill="none"
            stroke="currentColor"
            viewBox="0 0 24 24"
            xmlns="http://www.w3.org/2000/svg"
          >
            <path
              stroke-linecap="round"
              stroke-linejoin="round"
              stroke-width="2"
              d="M5 15l7-7 7 7"
            ></path>
          </svg>
          <svg
            class="w-4 h-4 cursor-pointer hover:text-red-400"
            fill="currentColor"
            viewBox="0 0 20 20"
            xmlns="http://www.w3.org/2000/svg"
          >
            <path
              fill-rule="evenodd"
              d="M10 18a8 8 0 100-16 8 8 0 000 16zM8.707 7.293a1 1 0 00-1.414 1.414L8.586 10l-1.293 1.293a1 1 0 101.414 1.414L10 11.414l1.293 1.293a1 1 0 001.414-1.414L11.414 10l1.293-1.293a1 1 0 00-1.414-1.414L10 8.586 8.707 7.293z"
              clip-rule="evenodd"
            ></path>
          </svg>
        </div>
      </div>
      <!-- Terminal Window -->
      <div class="h-72 p-1 bg-gray-900 font-mono">
        <div class="my-3">
          <span class="text-green-500">➜</span>
          <span>Hello World!</span>
          <span class="text-green-500">↲</span>
        </div>
        <div class="mb-3">
          <span class="text-green-600">the Anonymous.</span>
        </div>
      </div>
    </div>
  </div>

  <!-- Recent Posts -->
  <div class="min-h-screen pb-10 text-gray-900">
    <div class="flex justify-center py-5">
      <div class="container max-w-3xl p-4">
        <h1 class="text-2xl underline py-5">Recent Posts:</h1>
        <!-- Loop -->
        <div class="post py-5 max-h-70">
          <h2 class="font-bold text-xl " id="">
            {{ title }}
          </h2>
          <p class="turncate text-base" id="">
            {{ content }}
          </p>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
  export default {
    name: "Home",
    data() {
      return {
        title: "Title",
        content: "Content",
      };
    },
    props: {},
    methods: {},
  };
</script>
