<template>
  <!-- Search -->
  <div class="box w-3/5 pt-6 mb-6 mx-auto">
    <div class="box-wrapper">
      <div
        class="
          bg-white
          rounded
          flex
          items-center
          w-full
          p-3
          shadow-sm
          border border-gray-200
        "
      >
        <button @click="searchBoard()" class="outline-none focus:outline-none">
          <svg
            class="w-5 text-gray-600 h-5 cursor-pointer"
            fill="none"
            stroke-linecap="round"
            stroke-linejoin="round"
            stroke-width="2"
            stroke="currentColor"
            viewBox="0 0 24 24"
          >
            <path d="M21 21l-6-6m2-5a7 7 0 11-14 0 7 7 0 0114 0z"></path>
          </svg>
        </button>
        <input
          type="search"
          name=""
          id=""
          @keydown.enter="searchBoard()"
          placeholder="search"
          x-model="q"
          class="
            w-full
            pl-4
            text-sm
            outline-none
            focus:outline-none
            bg-transparent
          "
        />
        <!-- <div class="select">
          <select
            name=""
            id=""
            x-model="image_type"
            class="text-sm outline-none focus:outline-none bg-transparent"
          >
            <option value="all" selected>All</option>
            <option value="title">Title</option>
            <option value="body">Content</option>
          </select>
        </div> -->
      </div>
    </div>
  </div>

  <hr />

  <div class="my-3">
    <a class="text-2xl text-gray-700 font-bold">Recent Posts</a>
  </div>

  <!-- List Template -->
  <div
    class="px-10 my-4 py-6 rounded shadow-xl bg-gray-100 w-3/5 mx-auto max-h-60" 
  >
    <div class="flex justify-between items-center">
      <span class="font-light text-gray-600">{{ modDate }}</span>
      <a
        class="px-2 py-1 text-gray-600 font-bold rounded hover:text-yellow-500"
        href="#"
      >
        <svg
          xmlns="http://www.w3.org/2000/svg"
          class="h-5 w-5"
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
      </a>
    </div>
    <div class="mt-2">
      <h5 class="font-bold text-2xl">{{ title }}</h5>
      <p class="truncate mt-2 text-base text-gray-600">
        {{ content }}
      </p>
    </div>
    <div class="flex justify-center items-center mt-4">
      <a class="hover:text-green-500" href="#">More...</a>
    </div>
  </div>
</template>

<script>
  export default {
    name: "GetBoard",
    data() {
      return {
        title: "Title",
        content: "Content",
      };
    },
    props: {},
    methods: {
      searchBoard() {},
    },
  };
</script>
