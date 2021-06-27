<template>
  <div
    class="
      h-screen
      bg-white
      flex flex-col
      space-y-10
      justify-center
      items-center
    "
  >
    <div class="bg-white w-96 shadow-xl rounded p-5">
      <h1 class="text-3xl font-medium">Welcome</h1>
      <p class="text-sm">Minimal login page for day to day use</p>

      <form class="space-y-5 mt-5">
        <input
          type="text"
          class="w-full h-12 border border-gray-800 rounded px-3"
          placeholder="Email"
        />
        <div
          class="w-full flex items-center border border-gray-800 rounded px-3"
        >
          <input type="password" class="w-4/5 h-12" placeholder="Password" />
          <span class="text-blue-700 hover:bg-blue-400 rounded-md px-3"
            >Show</span
          >
        </div>

        <div class="">
          <a
            href="#!"
            class="font-medium text-blue-900 hover:bg-blue-300 rounded-md p-2"
            >Forgot Password ?</a
          >
        </div>

        <button
          class="
            text-center
            w-full
            bg-blue-900
            rounded-md
            text-white
            py-3
            font-medium
          "
        >
          Login
        </button>
      </form>
    </div>
  </div>
</template>
