import { ViewStyle } from "react-native/types";

export type ChangeEventPayload = {
  value: string;
};

type IOSSeries = {
  color: string;
  percentage: number;
};

type AndroidSeries = {
  x: string;
  y: number;
};

export type ExpoRadialChartViewProps = {
  style?: ViewStyle;
  data: IOSSeries[] | AndroidSeries[];
};
