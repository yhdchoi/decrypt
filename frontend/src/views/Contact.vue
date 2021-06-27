<template>
  <div class="h-screen flex justify-center items-center">
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
      <div class="h-full p-1 bg-gray-500 font-mono">
        <div class="my-3">
          <span class="text-green-500">➜</span>
          <span class="text-cyan-500">~</span>
          <span>Contact</span>
        </div>
        <!-- @submit.prevent="sendEmail" -->
        <form action="">
          <!-- Email -->
          <div class="mb-6">
            <input
              type="text"
              name="name"
              id="name"
              placeholder="Email "
              class="
                w-full
                px-3
                py-2
                placeholder-gray-300
                border border-gray-300
                bg-transparent
              "
              required
            />
          </div>
          <!-- Title -->
          <div class="mb-6">
            <input
              type="text"
              name="name"
              id="name"
              placeholder="Title"
              class="
                w-full
                px-3
                py-2
                placeholder-gray-300
                border border-gray-300
                bg-transparent
              "
              required
            />
          </div>
          <!-- Content -->
          <div class="mb-6">
            <textarea
              rows="25"
              name="message"
              id="message"
              placeholder="Your Message"
              class="
                w-full
                px-3
                py-2
                placeholder-gray-300
                border border-gray-300
                bg-transparent
                overflow-auto
                resize-none
              "
              required
            ></textarea>
          </div>
          <!-- Image Insert -->
          <div></div>
          <div class="flex justify-center">
            <button class="p-2 border w-1/4 rounded-md bg-gray-800 text-white">
              Send
            </button>
          </div>
        </form>
      </div>
    </div>
  </div>
</template>

<script>
  //import emailjs from 'emailjs-com';

  export default {
    name: "Contact",
    // methods: {
    //   sendEmail: (e) => {
    //     emailjs.sendForm('YOUR_SERVICE_ID', 'YOUR_TEMPLATE_ID', e.target, 'YOUR_USER_ID')
    //       .then((result) => {
    //           console.log('SUCCESS!', result.status, result.text);
    //       }, (error) => {
    //           console.log('FAILED...', error);
    //       });
    //   }
    // }
  };
</script>
