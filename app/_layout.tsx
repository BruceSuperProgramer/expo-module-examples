import { Stack } from "expo-router";

export default function RootLayout() {
  return (
    <Stack>
      <Stack.Screen name="home/index" options={{ title: "Welcome Home" }} />
      <Stack.Screen name="chart/index" options={{ title: "Welcome Chart" }} />
      <Stack.Screen name="login/index" options={{ title: "Welcome Login" }} />
    </Stack>
  );
}
