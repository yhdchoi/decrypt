<template>
  <div class="py-12">
    <div class="max-w-7xl mx-auto px-4 sm:px-6 lg:px-8">
      <div class="lg:text-center">
        <h2
          class="
            text-base text-white
            font-light
            inline
            rounded
            px-4
            py-2
            tracking-wide
            uppercase
            bg-gray-900
          "
        >
          api/auth
        </h2>
        <h3
          class="
            mt-3
            text-3xl
            leading-8
            font-medium
            tracking-tight
            text-gray-900
            hover:text-purple-500
            sm:text-4xl
          "
        >
          DEcrypt
        </h3>
        <p class="mt-4 max-w-2xl text-xl text-gray-500 lg:mx-auto">
          the ambiguous.
        </p>
      </div>

      <div class="mt-10">
        <dl
          class="
            space-y-10
            md:space-y-0 md:grid md:grid-cols-2 md:gap-x-8 md:gap-y-10
          "
        >
          <div class="relative">
            <dt>
              <h4
                class="
                  absolute
                  flex
                  items-center
                  justify-center
                  w-20
                  h-8
                  rounded-md
                  tracking-wide
                  font-regular
                  text-sm text-yellow-500
                "
              >
                GET
              </h4>
              <h5
                class="pt-1 ml-24 text-lg leading-6 font-medium text-gray-900"
              >
                GetMapping("/")
              </h5>
            </dt>
            <dd class="mt-1 ml-24 text-base text-gray-500">
              Annotation for mapping HTTP GET requests onto specific handler methods.
            </dd>
          </div>
          <div class="relative">
            <dt>
              <h4
                class="
                  absolute
                  flex
                  items-center
                  justify-center
                  w-20
                  h-8
                  rounded-md
                  tracking-wide
                  font-regular
                  text-sm text-blue-500
                "
              >
                POST
              </h4>
              <h5
                class="pt-1 ml-24 text-lg leading-6 font-medium text-gray-900"
              >
                PostMapping("/new")
              </h5>
            </dt>
            <dd class="mt-1 ml-24 text-base text-gray-500">
              Annotation for mapping HTTP POST requests onto specific handler methods.
            </dd>
          </div>
          <div class="relative">
            <dt>
              <h4
                class="
                  absolute
                  flex
                  items-center
                  justify-center
                  w-20
                  h-8
                  rounded-md
                  tracking-wide
                  font-regular
                  text-sm text-green-500
                "
              >
                PUT
              </h4>
              <h5
                class="pt-1 ml-24 text-lg leading-6 font-medium text-gray-900"
              >
                PutMapping("/modify")
              </h5>
            </dt>
            <dd class="mt-1 ml-24 text-base text-gray-500">
              Annotation for mapping HTTP PUT requests onto specific handler methods.
            </dd>
          </div>
          <div class="relative">
            <dt>
              <h4
                class="
                  absolute
                  flex
                  items-center
                  justify-center
                  w-20
                  h-8
                  rounded-md
                  tracking-wide
                  font-regular
                  text-sm text-red-500
                "
              >
                DELETE
              </h4>
              <h5
                class="pt-1 ml-24 text-lg leading-6 font-medium text-gray-900"
              >
                DeleteMapping("/remove")
              </h5>
            </dt>
            <dd class="mt-1 ml-24 text-base text-gray-500">
              Annotation for mapping HTTP DELETE requests onto specific handler methods.
            </dd>
          </div>
        </dl>
      </div>
    </div>
  </div>
</template>

<script>
  export default {
    name: "About",
  };
</script>
